/*
 * $Id: ForeignKeyEventListenerTest.java, 2018年6月7日 下午4:14:12 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener;

import cn.zzcode.listener.event.ForeignKeyEvent;

/**
 * <p>
 * Title: ForeignKeyEventListenerTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午4:14:12
 * @modified [who date description]
 * @check [who date description]
 */
public class ForeignKeyEventListenerTest implements ForeignKeyEventListener {

    /**
     * @see cn.zzcode.listener.ForeignKeyEventListener#Event(cn.zzcode.listener.event.ForeignKeyEvent)
     */
    public void Event(ForeignKeyEvent event) {
        System.out.println(event.getForeignkeyDefintion().getFkName());
    }

}
