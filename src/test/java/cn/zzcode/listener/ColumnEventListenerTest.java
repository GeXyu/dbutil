/*
 * $Id: ColumnEventListenerTest.java, 2018年6月7日 下午4:18:12 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener;

import cn.zzcode.listener.event.ColumnEvent;

/**
 * <p>
 * Title: ColumnEventListenerTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午4:18:12
 * @modified [who date description]
 * @check [who date description]
 */
public class ColumnEventListenerTest implements ColumnEventListener {

    /**
     * @see cn.zzcode.listener.ColumnEventListener#event(cn.zzcode.listener.event.ColumnEvent)
     */
    public void event(ColumnEvent event) {
        System.out.println(event.getColumnDefinition().getColnumName());

    }

}
