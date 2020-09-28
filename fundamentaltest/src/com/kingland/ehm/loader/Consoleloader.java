/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ehm.loader;

import com.kingland.ehm.BaseBuffer;

public class Consoleloader extends Dataloader {
    protected Consoleloader(BaseBuffer buffer) {
        super(buffer);
    }

    @Override
    public Object getData() {
        double random = Math.random();
        return "Hello world! " + random;
    }
}
