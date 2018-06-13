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
import cn.zzcode.definition.ViewDefinition;

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
public class ViewEvent extends TableEvent {

    private ViewDefinition viewDefinition;

    /**
     * @return the viewDefinition
     */
    public ViewDefinition getViewDefinition() {
        return viewDefinition;
    }

    /**
     * @param viewDefinition
     *            the viewDefinition to set
     */
    public void setViewDefinition(ViewDefinition viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    /**
     * @param dataBaseDefinition
     * @param tableDefinition
     * @param viewDefinition
     */
    public ViewEvent(DataBaseDefinition dataBaseDefinition, ViewDefinition viewDefinition) {
        super(dataBaseDefinition, null);
        this.viewDefinition = viewDefinition;
    }

}
