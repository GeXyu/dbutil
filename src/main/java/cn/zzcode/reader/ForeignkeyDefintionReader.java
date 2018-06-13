/*
 * $Id: ForeignkeyDefintionReader.java, 2018年6月7日 上午9:39:50 XiuYu.Ge Exp $
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
import cn.zzcode.definition.ForeignkeyDefintion;

/**
 * <p>
 * Title: ForeignkeyDefintionReader
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午9:39:50
 * @modified [who date description]
 * @check [who date description]
 */
public class ForeignkeyDefintionReader implements DefinitionReader {

    private static final ForeignkeyDefintionReader foreignkeyDefintionReader = new ForeignkeyDefintionReader();

    /**
     * @see cn.zzcode.reader.DefinitionReader#read(java.sql.ResultSet)
     */
    public Definition read(ResultSet rs) {

        try {
            ForeignkeyDefintion foreignkeyDefintion = new ForeignkeyDefintion();
            foreignkeyDefintion.setPkTableCat(rs.getString(NameConstant.PKTABLE_CAT));
            foreignkeyDefintion.setPkTableSchem(rs.getString(NameConstant.PKTABLE_SCHEM));
            foreignkeyDefintion.setFkTableName(rs.getString(NameConstant.PKTABLE_NAME));
            foreignkeyDefintion.setPkColumnName(rs.getString(NameConstant.PKCOLUMN_NAME));
            foreignkeyDefintion.setFkTableCat(rs.getString(NameConstant.FKTABLE_CAT));
            foreignkeyDefintion.setFkTableSchem(rs.getString(NameConstant.FKTABLE_SCHEM));
            foreignkeyDefintion.setFkTableName(rs.getString(NameConstant.FKTABLE_NAME));
            foreignkeyDefintion.setFkColumnName(rs.getString(NameConstant.FKCOLUMN_NAME));
            foreignkeyDefintion.setKeySeq(rs.getShort(NameConstant.KEY_SEQ));
            foreignkeyDefintion.setUpdateRule(rs.getShort(NameConstant.UPDATE_RULE));
            foreignkeyDefintion.setDelRule(rs.getShort(NameConstant.DELETE_RULE));
            foreignkeyDefintion.setFkName(rs.getString(NameConstant.FK_NAME));
            foreignkeyDefintion.setPkName(rs.getString(NameConstant.PK_NAME));
            foreignkeyDefintion.setDeferRability(rs.getShort(NameConstant.DEFERRABILITY));
            return foreignkeyDefintion;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 
     */
    public ForeignkeyDefintionReader() {
        super();
    }

    public static ForeignkeyDefintionReader getInstance() {
        return foreignkeyDefintionReader;
    }

}
