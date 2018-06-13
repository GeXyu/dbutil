/*
 * $Id: TableDefinitionTask.java, 2018年6月7日 上午10:52:26 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.task;

import java.sql.SQLException;

import cn.zzcode.core.CoreStartup;
import cn.zzcode.definition.TableDefinition;
import cn.zzcode.handler.IndexDefintionHandler;

/**
 * <p>
 * Title: TableDefinitionTask
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午10:52:26
 * @modified [who date description]
 * @check [who date description]
 */
public class IndexDefinitionTask extends DefinitionTask implements Runnable {

    private TableDefinition tableDefinition;

    /**
     * @param databaseMetaData
     * @param dataBaseDefinition
     * @param indexEventManager
     */
    public IndexDefinitionTask(TableDefinition tableDefinition) {
        super();
        this.tableDefinition = tableDefinition;
    }

    /**
     * @see java.lang.Runnable#run()
     */
    public void run() {
        try {
            new IndexDefintionHandler(tableDefinition).handler(CoreStartup.getDataBaseDefinition(),
                    CoreStartup.getDatabaseMetaData().getUserName(), tableDefinition.getTableName());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
