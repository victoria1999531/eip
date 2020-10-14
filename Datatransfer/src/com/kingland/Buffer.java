package com.kingland;

import java.util.LinkedList;

public class Buffer {
    //Buffer maximum capacity
    private final int MAX_SIZE = 100;

    LinkedList<Object> list = new LinkedList<Object>();
    public void loader(int num) {
        synchronized (list) {
            // Determines whether it will be full after loading
            while (list.size() + num> MAX_SIZE) {
                System.out.println("Buffer overload,Now the capacity：" + this.list.size() + "，If the cache continues to load after the remaining capacity" + (this.list.size() + num));
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("The size of the buffer now：" + this.list.size() + "Begin====>");
            for (int i = 0; i < num; i++) {
                list.add(new Object());
            }
            System.out.println("Load" + num + ",The size of the buffer now：" + this.list.size());
            //Wake up all waiting threads
            list.notifyAll();
        }
    }

    public void sender(int num) {
        synchronized (this.list) {
            while (this.list.size() < num) {
                System.out.println("Buffer area remaining capacity：" + this.list.size() + ",Want to send：" + num + "，quantity is not enough");
                try {
                    this.list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // Read buffer remaining capacity, sender number is less than buffer number
            for (int i = 0; i < num; i++) {
                list.remove();
            }
            System.out.println("Quantity taken out：" + num + ",the rest amount ：" + this.list.size());
            this.list.notifyAll();
        }
    }
}
