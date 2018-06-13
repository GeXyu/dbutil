/*
 * $Id: EventManager.java, 2018年6月7日 上午10:35:40 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener.manager;

import cn.zzcode.listener.Listener;
import cn.zzcode.listener.event.Event;

/**
 * <p>
 * Title: EventManager
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午10:35:40
 * @modified [who date description]
 * @check [who date description]
 */
public interface EventManager {

    /**
     * 
     * @param event
     */
    void publish(Event event);

    /**
     * 添加
     * 
     * @param listener
     */
    void addListener(Listener listener);

}
