/*
 * $Id: ManagerHolder.java, 2018年6月13日 上午11:16:38 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.core;

import cn.zzcode.listener.manager.ColumnEventManager;
import cn.zzcode.listener.manager.DataBaseEventManager;
import cn.zzcode.listener.manager.EventManager;
import cn.zzcode.listener.manager.ForeignKeyEventManager;
import cn.zzcode.listener.manager.IndexEventManager;
import cn.zzcode.listener.manager.PrimaryKeyEventManager;
import cn.zzcode.listener.manager.TableEventManager;
import cn.zzcode.listener.manager.ViewEventManager;

/**
 * <p>
 * Title: ManagerHolder
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月13日 上午11:16:38
 * @modified [who date description]
 * @check [who date description]
 */
public class ManagerHolder {

    private EventManager columnEventManager = new ColumnEventManager();

    private EventManager dataBaseEventManager = new DataBaseEventManager();

    private EventManager foreignKeyEventManager = new ForeignKeyEventManager();

    private EventManager indexEventManager = new IndexEventManager();

    private EventManager primaryKeyEventManager = new PrimaryKeyEventManager();

    private EventManager tableEventManager = new TableEventManager();

    private EventManager viewEventManager = new ViewEventManager();

    /**
     * @return the columnEventManager
     */
    public EventManager getColumnEventManager() {
        return columnEventManager;
    }

    /**
     * @param columnEventManager
     *            the columnEventManager to set
     */
    public void setColumnEventManager(EventManager columnEventManager) {
        this.columnEventManager = columnEventManager;
    }

    /**
     * @return the dataBaseEventManager
     */
    public EventManager getDataBaseEventManager() {
        return dataBaseEventManager;
    }

    /**
     * @param dataBaseEventManager
     *            the dataBaseEventManager to set
     */
    public void setDataBaseEventManager(EventManager dataBaseEventManager) {
        this.dataBaseEventManager = dataBaseEventManager;
    }

    /**
     * @return the foreignKeyEventManager
     */
    public EventManager getForeignKeyEventManager() {
        return foreignKeyEventManager;
    }

    /**
     * @param foreignKeyEventManager
     *            the foreignKeyEventManager to set
     */
    public void setForeignKeyEventManager(EventManager foreignKeyEventManager) {
        this.foreignKeyEventManager = foreignKeyEventManager;
    }

    /**
     * @return the indexEventManager
     */
    public EventManager getIndexEventManager() {
        return indexEventManager;
    }

    /**
     * @param indexEventManager
     *            the indexEventManager to set
     */
    public void setIndexEventManager(EventManager indexEventManager) {
        this.indexEventManager = indexEventManager;
    }

    /**
     * @return the primaryKeyEventManager
     */
    public EventManager getPrimaryKeyEventManager() {
        return primaryKeyEventManager;
    }

    /**
     * @param primaryKeyEventManager
     *            the primaryKeyEventManager to set
     */
    public void setPrimaryKeyEventManager(EventManager primaryKeyEventManager) {
        this.primaryKeyEventManager = primaryKeyEventManager;
    }

    /**
     * @return the tableEventManager
     */
    public EventManager getTableEventManager() {
        return tableEventManager;
    }

    /**
     * @param tableEventManager
     *            the tableEventManager to set
     */
    public void setTableEventManager(EventManager tableEventManager) {
        this.tableEventManager = tableEventManager;
    }

    /**
     * @return the viewEventManager
     */
    public EventManager getViewEventManager() {
        return viewEventManager;
    }

    /**
     * @param viewEventManager
     *            the viewEventManager to set
     */
    public void setViewEventManager(EventManager viewEventManager) {
        this.viewEventManager = viewEventManager;
    }

    /**
     * 
     */
    public ManagerHolder() {
    }

}
