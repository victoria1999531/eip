/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ehm.loader;

import com.kingland.ehm.BaseBuffer;

public class FileLoader extends Dataloader {
    protected FileLoader(BaseBuffer buffer) {
        super(buffer);
    }

    @Override
    public Object getData() {
        double random = Math.random();
        return "Hello world! " + random;
    }
}