/*
 * $Id: TableDefinitionReader.java, 2018年6月7日 上午8:55:10 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.zzcode.common.NameConstant;
import cn.zzcode.definition.Definition;
import cn.zzcode.definition.TableDefinition;

/**
 * <p>
 * Title: TableDefinitionReader
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午8:55:10
 * @modified [who date description]
 * @check [who date description]
 */
public class TableDefinitionReader implements DefinitionReader {

    private static final TableDefinitionReader tableDefinitionReader = new TableDefinitionReader();

    /**
     * @see cn.zzcode.reader.DefinitionReader#read(java.sql.ResultSet)
     */
    public Definition read(ResultSet rs) {

        try {
            TableDefinition tableDefinition = new TableDefinition();
            tableDefinition.setTableName(rs.getString(NameConstant.TABLE_NAME));
            tableDefinition.setTableType(rs.getString(NameConstant.TABLE_TYPE));
            tableDefinition.setRemark(rs.getString(NameConstant.REMARKS));
            return tableDefinition;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private TableDefinitionReader() {

    }

    public static TableDefinitionReader getInstance() {
        return tableDefinitionReader;
    }

}
