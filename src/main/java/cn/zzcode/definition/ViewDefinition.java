/*
 * $Id: ViewDefinition.java, 2018年6月6日 下午8:43:40 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.definition;

/**
 * <p>
 * Title: ViewDefinition
 * </p>
 * <p>
 * Description:试图元数据
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月6日 下午8:43:40
 * @modified [who date description]
 * @check [who date description]
 */
public class ViewDefinition extends Definition{

    // 视图名
    private String viewName;

    // 视图类型
    private String viewType;

    // 视图备注
    private String remarks;

    /**
     * @return the viewName
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * @param viewName
     *            the viewName to set
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * @return the viewType
     */
    public String getViewType() {
        return viewType;
    }

    /**
     * @param viewType
     *            the viewType to set
     */
    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     *            the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 
     */
    public ViewDefinition() {
        super();
    }

}
