package com.kingland.eip.ehm.LogTest;

public class ConsoleLog {

    private BaseLog baseLog = new BaseLog();

    /**
     * set minLength
     */
    public void setMinLength() {
        baseLog.setMinLength(5);
    }

    /**
     * set maxLength
     */
    public void setMaxLength() {
        baseLog.setMaxLength(10);

    }
    public BaseLog getLogger() {

        return baseLog;

    }


}
