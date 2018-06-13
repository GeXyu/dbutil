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
import cn.zzcode.definition.PrimaryKeyDefinition;
import cn.zzcode.definition.TableDefinition;
import cn.zzcode.listener.event.PrimaryKeyEvent;
import cn.zzcode.reader.PrimaryKeyDefinitionReader;

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
public class PrimaryKeyDefintionHandler implements DefintionHandler {

    private TableDefinition tableDefinition;

    /**
     * @see cn.zzcode.handler.DefintionHandler#handler(java.lang.String,
     *      java.lang.String)
     */
    public void handler(DataBaseDefinition dataBaseDefinition, String schemaName, String tableName) {
        try {
            ResultSet rs = CoreStartup.getDatabaseMetaData().getPrimaryKeys(null, schemaName, tableName);

            while (rs.next()) {

                // 解析
                PrimaryKeyDefinition viewDefinition = (PrimaryKeyDefinition) PrimaryKeyDefinitionReader.getInstance()
                        .read(rs);

                // 发布事件
                CoreStartup.getManagerHolder().getPrimaryKeyEventManager()
                        .publish(new PrimaryKeyEvent(dataBaseDefinition, this.tableDefinition, viewDefinition));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param primaryKeyDefinitionReader
     * @param dataBaseDefinition
     * @param tableDefinition
     */
    public PrimaryKeyDefintionHandler(TableDefinition tableDefinition) {
        super();
        this.tableDefinition = tableDefinition;
    }

}
