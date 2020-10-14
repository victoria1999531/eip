/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.main;

import com.kingland.main.Buffer.Buffer;
import com.kingland.main.Loader.ConsoleLoader;
import com.kingland.main.Sender.ConsoleSender;

public class ApplicationMain {
    public static void main(String[] args) {
        ConsoleSender consoleSender = new ConsoleSender();
        ConsoleLoader consoleLoader = new ConsoleLoader();
        Buffer buffer = new Buffer(consoleLoader, consoleSender);

        new Thread(() -> buffer.loader()).start();
        new Thread(() -> buffer.sender()).start();
    }
}
