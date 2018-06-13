/*
 * $Id: PrimaryKeyEventManager.java, 2018年6月7日 上午11:44:21 XiuYu.Ge Exp $
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
import cn.zzcode.listener.PrimaryKeyEventListener;
import cn.zzcode.listener.event.Event;
import cn.zzcode.listener.event.PrimaryKeyEvent;

/**
 * <p>
 * Title: PrimaryKeyEventManager
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午11:44:21
 * @modified [who date description]
 * @check [who date description]
 */
public class PrimaryKeyEventManager implements EventManager {

    private ArrayBlockingQueue<PrimaryKeyEventListener> queue = new ArrayBlockingQueue<PrimaryKeyEventListener>(5);

    /**
     * @see cn.zzcode.listener.manager.EventManager#publish(cn.zzcode.listener.event.Event)
     */
    public void publish(Event event) {
        synchronized (event) {
            Iterator<PrimaryKeyEventListener> iterator = queue.iterator();
            while (iterator.hasNext()) {
                PrimaryKeyEventListener next = iterator.next();
                next.Event((PrimaryKeyEvent) event);
            }
        }
    }

    /**
     * @see cn.zzcode.listener.manager.EventManager#addListener(cn.zzcode.listener.Listener)
     */
    public void addListener(Listener listener) {
        queue.add((PrimaryKeyEventListener) listener);
    }

}
