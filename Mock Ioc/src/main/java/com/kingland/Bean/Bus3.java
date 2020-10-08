/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.Bean;

public class Bus3 implements Bus {

    public void start() {
        System.out.println("Bus3 : start!");
    }

    public void turnLeft() {
        System.out.println("Bus3 : turn left!");
    }

    public void turnRight() {
        System.out.println("Bus3 : turn right!");
    }

    public void stop() {
        System.out.println("Bus3 : stop!");

    }

}
