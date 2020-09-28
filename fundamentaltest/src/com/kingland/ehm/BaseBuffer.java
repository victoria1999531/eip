package com.kingland.ehm;
/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

/**
 * @author KSC
 * @description
 */
public abstract class BaseBuffer<T>{
    private final int max;

    protected BaseBuffer(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public abstract int size();

    public abstract boolean add(Object o);

    public abstract Object poll();
}