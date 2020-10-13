package com.kingland;

import java.util.LinkedList;

public class Buffer {
    private final int MAX_SIZE = 100;

    LinkedList<Object> list = new LinkedList<Object>();

    public void product(int num) {
        synchronized (list) {
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
            list.notifyAll();
        }
    }

    public void custom(int num) {
        synchronized (this.list) {
            while (this.list.size() < num) {
                System.out.println("Buffer area remaining capacity：" + this.list.size() + ",Want to send：" + num + "，quantity is not enough");
                try {
                    this.list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < num; i++) {
                list.remove();
            }
            System.out.println("Quantity taken out：" + num + ",the rest amount ：" + this.list.size());
            this.list.notifyAll();
        }
    }
}
