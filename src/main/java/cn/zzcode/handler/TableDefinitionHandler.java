/*
 * $Id: TableDefinitionHandler.java, 2018年6月7日 上午10:16:30 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.zzcode.common.NameConstant;
import cn.zzcode.core.CoreStartup;
import cn.zzcode.definition.DataBaseDefinition;
import cn.zzcode.definition.TableDefinition;
import cn.zzcode.listener.event.TableEvent;
import cn.zzcode.reader.TableDefinitionReader;
import cn.zzcode.task.ColumnDefinitionTask;
import cn.zzcode.task.ForeignKeyDefinitionTask;
import cn.zzcode.task.IndexDefinitionTask;
import cn.zzcode.task.PrimaryKeyDefinitionTask;

/**
 * <p>
 * Title: TableDefinitionHandler
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午10:16:30
 * @modified [who date description]
 * @check [who date description]
 */
public class TableDefinitionHandler implements DefintionHandler {

    /**
     * @see cn.zzcode.handler.DefintionHandler#handler(java.sql.DatabaseMetaData,
     *      java.lang.String, java.lang.String)
     */
    public void handler(DataBaseDefinition dataBaseDefinition, String schemaName, String tableName) {

        try {
            String[] types = { NameConstant.TABLE };
            ResultSet rs = CoreStartup.getDatabaseMetaData().getTables(null, schemaName, NameConstant.PER_CENT, types);
            while (rs.next()) {

                ExecutorService threadPool = Executors.newFixedThreadPool(5);
                TableDefinition tableDefinition = (TableDefinition) TableDefinitionReader.getInstance().read(rs);

                // 表格处理发布事件
                TableEvent event = new TableEvent(dataBaseDefinition, tableDefinition);
                CoreStartup.getManagerHolder().getTableEventManager().publish(event);

                // 主键处理器
                PrimaryKeyDefinitionTask primaryKeyDefinitionTask = new PrimaryKeyDefinitionTask(tableDefinition);
                threadPool.submit(primaryKeyDefinitionTask);

                // 外键处理器
                ForeignKeyDefinitionTask foreignKeyDefinitionTask = new ForeignKeyDefinitionTask(tableDefinition);
                threadPool.submit(foreignKeyDefinitionTask);

                // 处理索引
                IndexDefinitionTask indexDefinitionTask = new IndexDefinitionTask(tableDefinition);
                threadPool.submit(indexDefinitionTask);

                // 列处理器
                ColumnDefinitionTask columnDefinitionTask = new ColumnDefinitionTask(tableDefinition);
                threadPool.submit(columnDefinitionTask);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
