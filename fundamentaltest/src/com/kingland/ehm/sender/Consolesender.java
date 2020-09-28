/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ehm.sender;

import com.kingland.ehm.BaseBuffer;

public class Consolesender extends Datasender{
    protected Consolesender(BaseBuffer buffer) {
        super(buffer);
    }

    @Override
    public void send(Object o) {
        System.out.println(o.toString());
    }
}