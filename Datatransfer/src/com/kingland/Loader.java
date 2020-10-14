/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland;

public class Loader implements Runnable {
    private Buffer buffer;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public Loader(Buffer buffer) {
        this.buffer = buffer;
    }

    private void loader(int num) {
        this.buffer.loader(num);
    }

    public void run() {
        this.loader(num);
    }
}

