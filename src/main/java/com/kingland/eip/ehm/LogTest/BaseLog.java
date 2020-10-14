/*

 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.

 */
package com.kingland.eip.ehm.LogTest;

public class BaseLog {
    /**
     * Begin message
     */
    private String title;
    /**
     * The minimum length of message
     */
    private int minLength;
    /**
     * The maximum length of message
     */
    private int maxLength;

    public void settitle(String title) {
        this.title = title;
    }
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public void log(String exception) throws Exception {
        System.out.println(title + exception);

    }
}
