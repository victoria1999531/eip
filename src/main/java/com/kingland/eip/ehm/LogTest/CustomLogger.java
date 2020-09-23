/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.ehm.LogTest;

public interface CustomLogger {
    void log(String exception);
    void log(String exception, String message);
}