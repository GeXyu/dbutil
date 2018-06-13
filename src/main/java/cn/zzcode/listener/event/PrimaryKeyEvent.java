/*
 * $Id: PrimaryKeyEvent.java, 2018年6月7日 上午11:46:06 XiuYu.Ge Exp $
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
import cn.zzcode.definition.PrimaryKeyDefinition;
import cn.zzcode.definition.TableDefinition;

/**
 * <p>
 * Title: PrimaryKeyEvent
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午11:46:06
 * @modified [who date description]
 * @check [who date description]
 */
public class PrimaryKeyEvent extends TableEvent {

    private PrimaryKeyDefinition primaryKeyDefinition;

    /**
     * @return the primaryKeyDefinition
     */
    public PrimaryKeyDefinition getPrimaryKeyDefinition() {
        return primaryKeyDefinition;
    }

    /**
     * @param primaryKeyDefinition
     *            the primaryKeyDefinition to set
     */
    public void setPrimaryKeyDefinition(PrimaryKeyDefinition primaryKeyDefinition) {
        this.primaryKeyDefinition = primaryKeyDefinition;
    }

    /**
     * @param dataBaseDefinition
     * @param tableDefinition
     */
    public PrimaryKeyEvent(DataBaseDefinition dataBaseDefinition, TableDefinition tableDefinition,
            PrimaryKeyDefinition primaryKeyDefinition) {
        super(dataBaseDefinition, tableDefinition);
        this.primaryKeyDefinition = primaryKeyDefinition;
    }

}
