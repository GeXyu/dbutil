/*
 * $Id: ColumnDefinitionReader.java, 2018年6月7日 上午9:09:47 XiuYu.Ge Exp $
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
import cn.zzcode.definition.ColumnDefinition;
import cn.zzcode.definition.Definition;

/**
 * <p>
 * Title: ColumnDefinitionReader
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午9:09:47
 * @modified [who date description]
 * @check [who date description]
 */
public class ColumnDefinitionReader implements DefinitionReader {

    private static final ColumnDefinitionReader columnDefinitionReader = new ColumnDefinitionReader();

    /**
     * @see cn.zzcode.reader.DefinitionReader#read(java.sql.ResultSet)
     */
    public Definition read(ResultSet rs) {

        try {
            ColumnDefinition columnDefinition = new ColumnDefinition();
            columnDefinition.setTableCat(rs.getString(NameConstant.TABLE_CAT));// 表目录（可能为空）
            columnDefinition.setTableSchem(rs.getString(NameConstant.TABLE_SCHEM));// 表的架构（可能为空）
            columnDefinition.setTableName(rs.getString(NameConstant.TABLE_NAME)); // 表名
            columnDefinition.setColnumName(rs.getString(NameConstant.COLUMN_NAME));// 列名
            columnDefinition.setDataType(rs.getInt(NameConstant.DATA_TYPE));
            columnDefinition.setDataTypeName(rs.getString(NameConstant.TYPE_NAME));
            columnDefinition.setColumnSize(rs.getInt(NameConstant.COLUMN_SIZE));
            columnDefinition.setDecimalDigits(rs.getInt(NameConstant.DECIMAL_DIGITS));

            columnDefinition.setNumPrecRadix(rs.getInt(NameConstant.NUM_PREC_RADIX));
            columnDefinition.setNullAble(rs.getInt(NameConstant.NULLABLE));
            columnDefinition.setRemark(rs.getString(NameConstant.REMARKS));
            columnDefinition.setColumnDef(rs.getString(NameConstant.COLUMN_DEF));
            columnDefinition.setSqlDataType(rs.getInt(NameConstant.SQL_DATA_TYPE));

            columnDefinition.setSqlDatetimeSub(rs.getInt(NameConstant.SQL_DATETIME_SUB));
            columnDefinition.setCharOctetLength(rs.getInt(NameConstant.CHAR_OCTET_LENGTH));
            columnDefinition.setOrdinalPosition(rs.getInt(NameConstant.ORDINAL_POSITION));
            return columnDefinition;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private ColumnDefinitionReader() {

    }

    public static ColumnDefinitionReader getInstance() {
        return columnDefinitionReader;
    }

}
