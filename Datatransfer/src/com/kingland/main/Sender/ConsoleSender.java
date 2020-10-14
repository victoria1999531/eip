/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.main.Sender;

public class ConsoleSender implements ISender {

    @Override
    public void send(Object object) {
        System.out.println(object.toString());
    }
}
