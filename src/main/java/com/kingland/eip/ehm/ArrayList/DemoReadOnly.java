/*

 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.

 */
package com.kingland.eip.ehm.ArrayList;

import java.util.ArrayList;

    public class DemoReadOnly {
        private ArrayList<Integer> ReadOnlyArraylist;

        public static void change(ArrayList<Integer> arrayList) {
            for(int i = 0; i < arrayList.size(); i++) {
                arrayList.set(i,0);
            }
        }

        public static void change1(ArrayList<Integer> arrayList) {
            int j = 0;
            for(int i : arrayList) {
                arrayList.set(j++,1);
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(0);
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);

            System.out.println("change old");
            for (int i : arrayList) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("change new");
            change(arrayList);
            for (int i : arrayList) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.println("change1 old");
            for (int i : arrayList) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("change1 new");
            change1(arrayList);
            for (int i : arrayList) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
