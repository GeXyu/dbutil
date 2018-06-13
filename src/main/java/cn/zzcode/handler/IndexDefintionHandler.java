/*
 * $Id: ViewDefintionHandle.java, 2018年6月7日 上午9:51:54 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.handler;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.zzcode.core.CoreStartup;
import cn.zzcode.definition.DataBaseDefinition;
import cn.zzcode.definition.IndexDefinition;
import cn.zzcode.definition.TableDefinition;
import cn.zzcode.listener.event.IndexEvent;
import cn.zzcode.reader.IndexDefinitionReader;
import cn.zzcode.utils.JdbcUtils;

/**
 * <p>
 * Title: ViewDefintionHandle
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午9:51:54
 * @modified [who date description]
 * @check [who date description]
 */
public class IndexDefintionHandler implements DefintionHandler {

    private TableDefinition tableDefinition;

    /**
     * @see cn.zzcode.handler.DefintionHandler#handler(java.lang.String,
     *      java.lang.String)
     */
    public void handler(DataBaseDefinition dataBaseDefinition, String schemaName, String tableName) {
        try {
            ResultSet rs = JdbcUtils.getDatabaseMetaData().getIndexInfo(null, schemaName, tableName, true, true);
            while (rs.next()) {

                // 解析
                IndexDefinition indexDefinition = (IndexDefinition) IndexDefinitionReader.getInstance().read(rs);

                // 发布事件
                CoreStartup.getManagerHolder().getIndexEventManager()
                        .publish(new IndexEvent(dataBaseDefinition, tableDefinition, indexDefinition));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param primaryKeyDefinitionReader
     * @param dataBaseDefinition
     * @param indexDefinition
     */
    public IndexDefintionHandler(TableDefinition tableDefinition) {
        super();
        this.tableDefinition = tableDefinition;
    }

}
