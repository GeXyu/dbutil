/*
 * $Id: EventListener.java, 2018年6月7日 上午10:29:53 XiuYu.Ge Exp $
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
 * Title: EventListener
 * </p>
 * <p>
 * Description:事件处理
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午10:29:53
 * @modified [who date description]
 * @check [who date description]
 */
public interface ViewEventListener extends Listener {

    void event(ViewEvent event);

}
