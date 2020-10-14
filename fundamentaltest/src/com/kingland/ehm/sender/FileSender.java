/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ehm.sender;

import com.kingland.ehm.BaseBuffer;

public class FileSender extends Datasender{
    protected FileSender(BaseBuffer buffer) {
        super(buffer);
    }

    @Override
    public void send(Object o) {
        System.out.println(o.toString());
    }
}