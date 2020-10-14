/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.main.Buffer;

import com.kingland.main.Loader.ILoader;
import com.kingland.main.Sender.ISender;

import java.util.LinkedList;

public class Buffer {
    //Buffer maximum capacity
    private final int MAX_SIZE = 5;

    LinkedList<Object> list = new LinkedList<Object>();
    private ILoader loader;
    private ISender sender;

    public Buffer(ILoader loader, ISender sender) {
        this.loader = loader;
        this.sender = sender;
    }


    public void loader() {
        for (; ; ) {
            Object data = loader.load();
            synchronized (this.list) {
                // Determines whether it will be full after loading
                while (list.size() >= MAX_SIZE) {
                    System.out.println("Buffer is overload, waiting sender.");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(data);
                System.out.println("Add data: [" + data + "] to buffer, buffer size is ：" + this.list.size());
                //Wake up all waiting threads
                list.notifyAll();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void sender() {

        // Read buffer remaining capacity, sender number is less than buffer number
        for (; ; ) {
            synchronized (this.list) {
                while (this.list.size() <= 0) {
                    System.out.println("Buffer is empty, waiting loader.");
                    try {
                        this.list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                sender.send(list.remove());
                System.out.println("Send data, buffer size is：" + this.list.size());
                this.list.notifyAll();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
