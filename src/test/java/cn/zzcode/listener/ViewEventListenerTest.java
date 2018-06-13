/*
 * $Id: ViewEventListenerTest.java, 2018年6月7日 下午1:03:18 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener;

import cn.zzcode.listener.event.ViewEvent;

/**
 * <p>
 * Title: ViewEventListenerTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午1:03:18
 * @modified [who date description]
 * @check [who date description]
 */
public class ViewEventListenerTest implements ViewEventListener {

    /**
     * @see cn.zzcode.listener.ViewEventListener#event(cn.zzcode.listener.event.ViewEvent)
     */
    public void event(ViewEvent event) {
        System.out.println("view: " + event.getViewDefinition().getViewName());

    }

}
