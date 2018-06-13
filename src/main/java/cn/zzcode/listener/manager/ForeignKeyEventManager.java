/*
 * $Id: ForeignKeyEventManager.java, 2018年6月7日 下午12:01:00 XiuYu.Ge Exp $
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

import cn.zzcode.listener.ForeignKeyEventListener;
import cn.zzcode.listener.Listener;
import cn.zzcode.listener.event.Event;
import cn.zzcode.listener.event.ForeignKeyEvent;

/**
 * <p>
 * Title: ForeignKeyEventManager
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午12:01:00
 * @modified [who date description]
 * @check [who date description]
 */
public class ForeignKeyEventManager implements EventManager {

    private ArrayBlockingQueue<ForeignKeyEventListener> queue = new ArrayBlockingQueue<ForeignKeyEventListener>(5);

    /**
     * @see cn.zzcode.listener.manager.EventManager#publish(cn.zzcode.listener.event.Event)
     */
    public void publish(Event event) {

        Iterator<ForeignKeyEventListener> iterator = queue.iterator();
        while (iterator.hasNext()) {
            ForeignKeyEventListener next = iterator.next();
            next.Event((ForeignKeyEvent) event);
        }

    }

    /**
     * @see cn.zzcode.listener.manager.EventManager#addListener(cn.zzcode.listener.Listener)
     */
    public void addListener(Listener listener) {
        queue.add((ForeignKeyEventListener) listener);
    }

}
