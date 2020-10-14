/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ehm.loader;

import com.kingland.ehm.BaseBuffer;

/**
 * @author KSC
 * @description
 */
public abstract class Dataloader<T> extends Thread {
    private final BaseBuffer buffer;

    protected Dataloader(BaseBuffer buffer) {
        this.buffer = buffer;
    }

    public abstract T getData();

    @Override
    public void run() {
        while (true) {
            if (buffer.size() < buffer.getMax()) {
                buffer.add(getData());
            }
        }
    }
}