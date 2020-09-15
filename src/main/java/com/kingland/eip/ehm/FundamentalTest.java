/*

 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.

 */
package com.kingland.eip.ehm;

import java.time.LocalDate;
import java.time.LocalTime;

public class FundamentalTest {
    /**
     * The number and  abbreviation  of the month
     */
    public static final int Month = 10;
 //1.使用Intellij 创建一个包，包名为ehm,创建一个叫做FundamentalTest的java文件，在其中打印“hello world”。
    public static void main(String[] args) {
        System.out.println("hello world");

        /**
         *The line number of Star
         */
        print(10);
        printMonth(Month);
        int length = stringFormat("Good morning");
        if(length %2==0)

        {
            System.out.println("The length of String is : " + length);
        } else

        {
            System.out.println("The length of String is Odd number");
        }
    }
    /*2.使用刚刚创建的java文件写代码，完成以下功能，打印下方的图案，并且写上java doc，
    在图案的下方打印当前的日期，以及时间（使用LocalDate 和LocalTime）
            **********
            *********
            ********
            *******
            */
    /**
     * Flashbacks output stars and time
     */
    public static void print(int n) {
        final String star = "*";
        for (int i = n; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println("LocalDate is :" + LocalDate.now() + "LocalTime is :" + LocalTime.now());
    }
   //3.定义一个不可变int变量代表月份 ， 初始月份为10月，在不同的月份输出对应的月份的英文缩写。
    /**
     * This will prints out the corresponding month abbreviation
     */
    public static void printMonth(int num) {
        switch (num) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            default:
                System.out.println("Dec");
                break;
        }
    }
  /*
  4.定义一个方法，这个方法在main函数中调用，在main函数中定义一个字符串“Good Morning”，
  把字符串作为参数传入定义的方法中，如果字符串含有空格，并且字符串第一个字母为G，
  则把这个字符串用空格进行分割，将分割后的两个单词打出来,并且一个单词为一行（使用for each的形式），
  然后将“Good Morning”的长度作为这个方法的返回值，最后在main函数中判断如果长度为偶数，
  则打印这个字符串的长度，否侧输出“字符串为奇数”
   */
    /**
     * If the original String meets the requirements,  every element in it will be printed out and return the he length of it
     */
    public static int stringFormat(String origin) {
        if (null == origin || origin.isEmpty()) {
            return 0;
        }
        final char space = ' ';
        final char characterG = 'G';
        if (origin.indexOf(space) != -1 && origin.charAt(0) == characterG) {
            String[] stringArray = origin.split(String.valueOf(space));
            for (String character : stringArray) {
                System.out.println(character);
            }
        }
        return origin.length();
    }
}
