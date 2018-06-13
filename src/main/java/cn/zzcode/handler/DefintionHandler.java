/*
 * $Id: DefintionHandler.java, 2018年6月7日 上午9:52:20 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.handler;

import cn.zzcode.definition.DataBaseDefinition;

/**
 * <p>
 * Title: DefintionHandler
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午9:52:20
 * @modified [who date description]
 * @check [who date description]
 */
public interface DefintionHandler {

    /**
     * 
     * @param schemaName
     * @param tableName
     */
    void handler(DataBaseDefinition dataBaseDefinition, String schemaName, String tableName);
}
