/*
 * $Id: TableEvent.java, 2018年6月7日 上午10:27:24 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener.event;

import cn.zzcode.definition.DataBaseDefinition;
import cn.zzcode.definition.TableDefinition;

/**
 * <p>
 * Title: TableEvent
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午10:27:24
 * @modified [who date description]
 * @check [who date description]
 */
public class TableEvent extends DataBaseEvent {

    protected TableDefinition tableDefinition;

    /**
     * @return the tableDefinition
     */
    public TableDefinition getTableDefinition() {
        return tableDefinition;
    }

    /**
     * @param tableDefinition
     *            the tableDefinition to set
     */
    public void setTableDefinition(TableDefinition tableDefinition) {
        this.tableDefinition = tableDefinition;
    }

    /**
     * @param dataBaseDefinition
     * @param tableDefinition
     */
    public TableEvent(DataBaseDefinition dataBaseDefinition, TableDefinition tableDefinition) {
        super(dataBaseDefinition);
        this.tableDefinition = tableDefinition;
    }

}
