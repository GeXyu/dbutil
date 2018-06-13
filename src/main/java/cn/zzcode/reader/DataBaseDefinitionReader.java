/*
 * $Id: DataBaseDefinitionReader.java, 2018年6月7日 上午8:41:26 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.reader;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import cn.zzcode.definition.DataBaseDefinition;
import cn.zzcode.exception.DefinitionReadException;

/**
 * <p>
 * Title: DataBaseDefinitionReader
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午8:41:26
 * @modified [who date description]
 * @check [who date description]
 */
public class DataBaseDefinitionReader {

    private static final DataBaseDefinitionReader dataBaseDefinitionReader = new DataBaseDefinitionReader();

    /**
     * @throws DefinitionReadException
     * @see cn.zzcode.reader.DefinitionReader#read(java.sql.DatabaseMetaData)
     */
    public static DataBaseDefinition read(DatabaseMetaData metaData) {

        try {
            DataBaseDefinition definition = new DataBaseDefinition();
            definition.setUserName(metaData.getUserName());
            definition.setSystemFunctions(metaData.getSystemFunctions());
            definition.setTimeDateFunctions(metaData.getTimeDateFunctions());
            definition.setStringFunctions(metaData.getStringFunctions());
            definition.setSchemaTerm(metaData.getSchemaTerm());

            definition.setURL(metaData.getURL());
            definition.setReadOnly(metaData.isReadOnly());
            definition.setDatabaseProductName(metaData.getDatabaseProductName());
            definition.setDatabaseProductVersion(metaData.getDatabaseProductVersion());
            definition.setDriverName(metaData.getDriverName());
            definition.setDriverVersion(metaData.getDriverVersion());
            return definition;
        } catch (SQLException e) {

        }
        return null;

    }

    private DataBaseDefinitionReader() {

    }

    public static DataBaseDefinitionReader getInstance() {
        return dataBaseDefinitionReader;
    }

}
