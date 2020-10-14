/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.ehm.LogTest;

public class FileLog {
    /**
     * base log
     */
    private BaseLog baseLogger = new BaseLog();
    /**
     * set minLength
     */
    public void setMinLength() {
        baseLogger.setMinLength(10);
    }
    /**
     * set maxLength
     */
    public void setMaxLength() {
        baseLogger.setMaxLength(20);

    }
}
