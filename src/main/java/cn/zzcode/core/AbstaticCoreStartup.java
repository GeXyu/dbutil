/*
 * $Id: AbstaticCoreStartup.java, 2018年6月13日 上午11:11:50 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.core;

import cn.zzcode.listener.ColumnEventListener;
import cn.zzcode.listener.DataBaseEventListener;
import cn.zzcode.listener.ForeignKeyEventListener;
import cn.zzcode.listener.IndexEventListener;
import cn.zzcode.listener.PrimaryKeyEventListener;
import cn.zzcode.listener.TableEventListener;
import cn.zzcode.listener.ViewEventListener;

/**
 * <p>
 * Title: AbstaticCoreStartup
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月13日 上午11:11:50
 * @modified [who date description]
 * @check [who date description]
 */
public abstract class AbstaticCoreStartup {

    private static ManagerHolder managerHolder = new ManagerHolder();

    public abstract void run();

    public void addListener(TableEventListener tableEventListener) {
        managerHolder.getTableEventManager().addListener(tableEventListener);

    }

    public void addListener(DataBaseEventListener dataBaseEventListener) {
        managerHolder.getDataBaseEventManager().addListener(dataBaseEventListener);
    }

    public void addListener(ViewEventListener viewEventListener) {
        managerHolder.getViewEventManager().addListener(viewEventListener);
    }

    public void addListener(PrimaryKeyEventListener primaryKeyEventListener) {
        managerHolder.getPrimaryKeyEventManager().addListener(primaryKeyEventListener);
    }

    public void addListener(ForeignKeyEventListener foreignKeyEventListener) {
        managerHolder.getForeignKeyEventManager().addListener(foreignKeyEventListener);
    }

    public void addListener(IndexEventListener indexEventListener) {
        managerHolder.getIndexEventManager().addListener(indexEventListener);
    }

    public void addListener(ColumnEventListener columnEventListener) {
        managerHolder.getColumnEventManager().addListener(columnEventListener);
    }

    /**
     * @return the managerHolder
     */
    public static ManagerHolder getManagerHolder() {
        return managerHolder;
    }

}
