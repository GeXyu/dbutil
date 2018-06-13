/*
 * $Id: ForeignKeyEvent.java, 2018年6月7日 下午12:01:55 XiuYu.Ge Exp $
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
import cn.zzcode.definition.ForeignkeyDefintion;
import cn.zzcode.definition.TableDefinition;

/**
 * <p>
 * Title: ForeignKeyEvent
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午12:01:55
 * @modified [who date description]
 * @check [who date description]
 */
public class ForeignKeyEvent extends TableEvent {

    private ForeignkeyDefintion foreignkeyDefintion;

    /**
     * @return the foreignkeyDefintion
     */
    public ForeignkeyDefintion getForeignkeyDefintion() {
        return foreignkeyDefintion;
    }

    /**
     * @param foreignkeyDefintion
     *            the foreignkeyDefintion to set
     */
    public void setForeignkeyDefintion(ForeignkeyDefintion foreignkeyDefintion) {
        this.foreignkeyDefintion = foreignkeyDefintion;
    }

    /**
     * @param dataBaseDefinition
     * @param tableDefinition
     */
    public ForeignKeyEvent(DataBaseDefinition dataBaseDefinition, TableDefinition tableDefinition,
            ForeignkeyDefintion foreignkeyDefintion) {
        super(dataBaseDefinition, tableDefinition);
        this.foreignkeyDefintion = foreignkeyDefintion;
    }

}
