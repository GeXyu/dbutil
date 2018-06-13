/*
 * $Id: ForeignKeyEventListener.java, 2018年6月7日 下午12:01:34 XiuYu.Ge Exp $
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
 * Title: ForeignKeyEventListener
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午12:01:34
 * @modified [who date description]
 * @check [who date description]
 */
public interface ForeignKeyEventListener extends Listener {

    void Event(ForeignKeyEvent event);
}
