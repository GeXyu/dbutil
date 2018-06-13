/*
 * $Id: PrimaryKeyDefinitionReader.java, 2018年6月7日 上午9:33:09 XiuYu.Ge Exp $
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
import cn.zzcode.definition.PrimaryKeyDefinition;

/**
 * <p>
 * Title: PrimaryKeyDefinitionReader
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午9:33:09
 * @modified [who date description]
 * @check [who date description]
 */
public class PrimaryKeyDefinitionReader implements DefinitionReader {

    private static final PrimaryKeyDefinitionReader primaryKeyDefinitionReader = new PrimaryKeyDefinitionReader();

    /**
     * @see cn.zzcode.reader.DefinitionReader#read(java.sql.ResultSet)
     */
    public Definition read(ResultSet rs) {

        try {
            PrimaryKeyDefinition PrimaryKeyDefinition = new PrimaryKeyDefinition();

            PrimaryKeyDefinition.setColumnName(rs.getString(NameConstant.COLUMN_NAME));// 列名
            PrimaryKeyDefinition.setKeySeq(rs.getShort(NameConstant.KEY_SEQ));// 序列号(主键内值1表示第一列的主键，值2代表主键内的第二列)
            PrimaryKeyDefinition.setPkName(rs.getString(NameConstant.PK_NAME));

            return PrimaryKeyDefinition;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private PrimaryKeyDefinitionReader() {

    }

    public static PrimaryKeyDefinitionReader getInstance() {
        return primaryKeyDefinitionReader;

    }

}
