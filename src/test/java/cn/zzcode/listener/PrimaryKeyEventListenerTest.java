/*
 * $Id: PrimaryKeyEventListenerTest.java, 2018年6月7日 下午1:04:36 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener;

import cn.zzcode.listener.event.PrimaryKeyEvent;

/**
 * <p>
 * Title: PrimaryKeyEventListenerTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午1:04:36
 * @modified [who date description]
 * @check [who date description]
 */
public class PrimaryKeyEventListenerTest implements PrimaryKeyEventListener {

    /**
     * @see cn.zzcode.listener.PrimaryKeyEventListener#Event(cn.zzcode.listener.event.PrimaryKeyEvent)
     */
    public void Event(PrimaryKeyEvent event) {
        System.out.println(event.getPrimaryKeyDefinition().getPkName());

    }

}
