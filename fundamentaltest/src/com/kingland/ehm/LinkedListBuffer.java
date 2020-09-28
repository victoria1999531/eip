package com.kingland.ehm;
/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author KSC
 * @description
 */
public class LinkedListBuffer<T> extends BaseBuffer {
    private final Queue<T> queue;

    public LinkedListBuffer(int max) {
        super(max);
        this.queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean add(Object o) {
        return queue.add((T) o);
    }

    @Override
    public Object poll() {
        return queue.poll();
    }
}