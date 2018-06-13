/*
 * $Id: TableEventManager.java, 2018年6月7日 上午10:39:32 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener.manager;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

import cn.zzcode.listener.Listener;
import cn.zzcode.listener.ViewEventListener;
import cn.zzcode.listener.event.Event;
import cn.zzcode.listener.event.ViewEvent;

/**
 * <p>
 * Title: TableEventManager
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午10:39:32
 * @modified [who date description]
 * @check [who date description]
 */
public class ViewEventManager implements EventManager {

    private ArrayBlockingQueue<ViewEventListener> queue = new ArrayBlockingQueue<ViewEventListener>(5);

    /**
     * @see cn.zzcode.listener.manager.EventManager#publish(cn.zzcode.listener.event.Event)
     */
    public void publish(Event event) {

        Iterator<ViewEventListener> iterator = queue.iterator();
        while (iterator.hasNext()) {
            ViewEventListener next = iterator.next();
            next.event((ViewEvent) event);
        }

    }

    /**
     * @see cn.zzcode.listener.manager.EventManager#addListener(cn.zzcode.listener.Listener)
     */
    public void addListener(Listener listener) {
        queue.add((ViewEventListener) listener);
    }

}
