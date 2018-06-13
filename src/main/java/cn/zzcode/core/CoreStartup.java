/*
 * $Id: CoreStartup.java, 2018年6月6日 下午8:58:00 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.core;

import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.zzcode.definition.DataBaseDefinition;
import cn.zzcode.listener.event.DataBaseEvent;
import cn.zzcode.reader.DataBaseDefinitionReader;
import cn.zzcode.task.TableDefinitionTask;
import cn.zzcode.task.ViewDefinitionTask;
import cn.zzcode.utils.JdbcUtils;

/**
 * <p>
 * Title: CoreStartup
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月6日 下午8:58:00
 * @modified [who date description]
 * @check [who date description]
 */
public class CoreStartup extends AbstaticCoreStartup {

    private static DatabaseMetaData databaseMetaData = JdbcUtils.getDatabaseMetaData();

    private static DataBaseDefinition dataBaseDefinition = null;

    @SuppressWarnings("static-access")
    public void run() {

        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        dataBaseDefinition = DataBaseDefinitionReader.getInstance().read(databaseMetaData);

        // 发布事件
        getManagerHolder().getDataBaseEventManager().publish(new DataBaseEvent(dataBaseDefinition));

        // 解析表
        TableDefinitionTask tableDefinitionTask = new TableDefinitionTask();
        threadPool.execute(tableDefinitionTask);

        // 解析试图
        ViewDefinitionTask viewDefinitionTask = new ViewDefinitionTask();
        threadPool.execute(viewDefinitionTask);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @return the databaseMetaData
     */
    public static DatabaseMetaData getDatabaseMetaData() {
        return databaseMetaData;
    }

    /**
     * @return the dataBaseDefinition
     */
    public static DataBaseDefinition getDataBaseDefinition() {
        return dataBaseDefinition;
    }

}
