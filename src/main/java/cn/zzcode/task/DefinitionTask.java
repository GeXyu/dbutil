/*
 * $Id: DefinitionTask.java, 2018年6月7日 上午11:02:13 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.task;

import java.sql.DatabaseMetaData;

import cn.zzcode.definition.DataBaseDefinition;
import cn.zzcode.definition.TableDefinition;

/**
 * <p>
 * Title: DefinitionTask
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午11:02:13
 * @modified [who date description]
 * @check [who date description]
 */
public class DefinitionTask {

    protected DatabaseMetaData databaseMetaData;

    protected DataBaseDefinition dataBaseDefinition;

    protected TableDefinition tableDefinition;

    /**
     * @return the databaseMetaData
     */
    public DatabaseMetaData getDatabaseMetaData() {
        return databaseMetaData;
    }

    /**
     * @param databaseMetaData
     *            the databaseMetaData to set
     */
    public void setDatabaseMetaData(DatabaseMetaData databaseMetaData) {
        this.databaseMetaData = databaseMetaData;
    }

    /**
     * @return the dataBaseDefinition
     */
    public DataBaseDefinition getDataBaseDefinition() {
        return dataBaseDefinition;
    }

    /**
     * @param dataBaseDefinition
     *            the dataBaseDefinition to set
     */
    public void setDataBaseDefinition(DataBaseDefinition dataBaseDefinition) {
        this.dataBaseDefinition = dataBaseDefinition;
    }

    /**
     * @return the tableDefinition
     */
    public TableDefinition getTableDefinition() {
        return tableDefinition;
    }

    /**
     * @param tableDefinition
     *            the tableDefinition to set
     */
    public void setTableDefinition(TableDefinition tableDefinition) {
        this.tableDefinition = tableDefinition;
    }

}
