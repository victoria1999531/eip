/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.ehm.sender;

import com.kingland.ehm.BaseBuffer;

public abstract class Datasender<T> extends Thread {
    private final BaseBuffer buffer;

    protected Datasender(BaseBuffer buffer) {
        this.buffer = buffer;
    }

    public abstract void send(T t);

    @Override
    public void run() {
        while (true) {
            if (buffer.size() > 0) {
                send((T) buffer.poll());
            }
        }
    }
}