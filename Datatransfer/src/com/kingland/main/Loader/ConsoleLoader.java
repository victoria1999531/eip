/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.main.Loader;

import com.kingland.main.Buffer.Buffer;

import java.util.Scanner;

public class ConsoleLoader implements ILoader {

    @Override
    public Object load() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some text in the console.");
        return  scanner.next();
    }
}

