/*
 * $Id: DataBaseEvent.java, 2018年6月7日 上午10:29:00 XiuYu.Ge Exp $
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

/**
 * <p>
 * Title: DataBaseEvent
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午10:29:00
 * @modified [who date description]
 * @check [who date description]
 */
public class DataBaseEvent extends Event {

    protected DataBaseDefinition dataBaseDefinition;

    /**
     * @return the dataBaseDefinition
     */
    public DataBaseDefinition getDataBaseDefinition() {
        return dataBaseDefinition;
    }

    /**
     * @param dataBaseDefinition
     *            the dataBaseDefinition to set
     */
    public void setDataBaseDefinition(DataBaseDefinition dataBaseDefinition) {
        this.dataBaseDefinition = dataBaseDefinition;
    }

    /**
     * @param dataBaseDefinition
     */
    public DataBaseEvent(DataBaseDefinition dataBaseDefinition) {
        super();
        this.dataBaseDefinition = dataBaseDefinition;
    }

}
