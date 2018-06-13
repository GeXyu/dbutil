/*
 * $Id: IndexDefinitionReader.java, 2018年6月7日 上午9:21:00 XiuYu.Ge Exp $
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
import cn.zzcode.definition.IndexDefinition;

/**
 * <p>
 * Title: IndexDefinitionReader
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午9:21:00
 * @modified [who date description]
 * @check [who date description]
 */
public class IndexDefinitionReader implements DefinitionReader {

    private static final IndexDefinitionReader indexDefinitionReader = new IndexDefinitionReader();

    /**
     * @see cn.zzcode.reader.DefinitionReader#read(java.sql.ResultSet)
     */
    public Definition read(ResultSet rs) {

        try {
            IndexDefinition indexDefintion = new IndexDefinition();
            indexDefintion.setNonUnique(rs.getBoolean(NameConstant.NON_UNIQUE));
            indexDefintion.setIndexQualifier(rs.getString(NameConstant.INDEX_QUALIFIER));
            indexDefintion.setIndexName(rs.getString(NameConstant.INDEX_NAME));

            indexDefintion.setType(rs.getShort(NameConstant.TYPE));
            indexDefintion.setOrdinalPosition(rs.getShort(NameConstant.ORDINAL_POSITION));
            indexDefintion.setColumnName(rs.getString(NameConstant.COLUMN_NAME));
            indexDefintion.setAscOrDesc(rs.getString(NameConstant.ASC_OR_DESC));
            indexDefintion.setCardinality(rs.getInt(NameConstant.CARDINALITY));

            return indexDefintion;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private IndexDefinitionReader() {

    }

    public static IndexDefinitionReader getInstance() {
        return indexDefinitionReader;
    }

}
