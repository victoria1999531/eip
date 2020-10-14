/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.Bean;

public abstract class Employee {
    private Bus bus;
    public Employee(Bus bus) {
        this.bus = bus;
    }
    public abstract void bybus();

}
