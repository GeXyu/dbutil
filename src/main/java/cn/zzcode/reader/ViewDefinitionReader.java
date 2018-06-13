/*
 * $Id: ViewDefinitionReader.java, 2018年6月7日 上午9:07:42 XiuYu.Ge Exp $
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
import cn.zzcode.definition.ViewDefinition;

/**
 * <p>
 * Title: ViewDefinitionReader
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午9:07:42
 * @modified [who date description]
 * @check [who date description]
 */
public class ViewDefinitionReader implements DefinitionReader {

    private static ViewDefinitionReader viewDefinitionReader = new ViewDefinitionReader();

    /**
     * @see cn.zzcode.reader.DefinitionReader#read(java.sql.ResultSet)
     */
    public Definition read(ResultSet rs) {
        try {
            ViewDefinition viewDefintion = new ViewDefinition();

            viewDefintion.setViewName(rs.getString(NameConstant.TABLE_NAME));
            viewDefintion.setViewType(rs.getString(NameConstant.TABLE_TYPE));
            viewDefintion.setRemarks(rs.getString(NameConstant.REMARKS));
            return viewDefintion;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private ViewDefinitionReader() {
        
    }
    
    
    public static ViewDefinitionReader getInstance() {
        return viewDefinitionReader;
        
    }
}
