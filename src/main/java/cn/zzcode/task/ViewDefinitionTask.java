/*
 * $Id: TableDefinitionTask.java, 2018年6月7日 上午10:52:26 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.task;

import java.sql.SQLException;

import cn.zzcode.core.CoreStartup;
import cn.zzcode.handler.ViewDefintionHandler;

/**
 * <p>
 * Title: TableDefinitionTask
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午10:52:26
 * @modified [who date description]
 * @check [who date description]
 */
public class ViewDefinitionTask extends DefinitionTask implements Runnable {

    /**
     * @see java.lang.Runnable#run()
     */
    public void run() {
        try {
            ViewDefintionHandler viewDefintionHandler = new ViewDefintionHandler();
            viewDefintionHandler.handler(CoreStartup.getDataBaseDefinition(),
                    CoreStartup.getDatabaseMetaData().getUserName(), null);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
