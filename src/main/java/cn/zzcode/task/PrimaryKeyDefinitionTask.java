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
import cn.zzcode.handler.PrimaryKeyDefintionHandler;

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
public class PrimaryKeyDefinitionTask extends DefinitionTask implements Runnable {

    /**
     * @param databaseMetaData
     * @param dataBaseDefinition
     * @param primaryKeyEventManager
     */
    public PrimaryKeyDefinitionTask(TableDefinition tableDefinition) {
        this.tableDefinition = tableDefinition;
    }

    /**
     * @see java.lang.Runnable#run()
     */
    public void run() {

        try {
            PrimaryKeyDefintionHandler PrimaryKeyDefinitionHandler = new PrimaryKeyDefintionHandler(
                    this.tableDefinition);
            PrimaryKeyDefinitionHandler.handler(CoreStartup.getDataBaseDefinition(),
                    CoreStartup.getDatabaseMetaData().getUserName(), this.tableDefinition.getTableName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
