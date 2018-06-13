/*
 * $Id: PrimaryKeyEventListener.java, 2018年6月7日 上午11:45:12 XiuYu.Ge Exp $
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
 * Title: PrimaryKeyEventListener
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午11:45:12
 * @modified [who date description]
 * @check [who date description]
 */
public interface ColumnEventListener extends Listener {

    void Event(ColumnEvent event);
}
