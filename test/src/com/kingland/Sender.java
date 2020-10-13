/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland;

public class Sender implements Runnable {
    private Buffer buffer;
    private int num;

    //buffer
    public Sender(Buffer buffer) {
        this.buffer = buffer;
    }

    private void sender(int num) {
        this.buffer.custom(num);
    }

    public void run() {
        this.sender(num);
    }

    public void setNum(int num) {
        this.num = num;
    }
}
