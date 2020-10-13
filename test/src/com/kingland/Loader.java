/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland;

public class Loader implements Runnable {
    //仓库对象
    private Buffer buffer;

    //生产的数量
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public Loader(Buffer buffer) {
        this.buffer = buffer;
    }

    private void prodcut(int num) {
        this.buffer.product(num);
    }

    public void run() {
        this.prodcut(num);
    }
}

