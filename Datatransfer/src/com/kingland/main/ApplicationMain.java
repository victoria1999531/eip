/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.main;

import com.kingland.main.Loader.Loader;

public class ApplicationMain {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Loader loader = new Loader(buffer);
        loader.setNum(100);

        Loader loader1 = new Loader(buffer);
        loader1.setNum(100);

        Sender sender = new Sender(buffer);

        sender.setNum(90);


        new Thread(loader).start();
        new Thread(sender).start();
        new Thread(loader1).start();
    }
}
