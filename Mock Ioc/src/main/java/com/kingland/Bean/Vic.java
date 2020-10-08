/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.Bean;

public class Vic extends Employee{
    public Vic(Bus bus) {
        super(bus);
    }
    public void bybus() {
        System.out.println("Victoria takes the No. 26 bus home");
    }
}
