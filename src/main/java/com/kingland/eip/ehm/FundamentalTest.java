package com.kingland.eip.ehm;

import java.time.LocalDate;
import java.time.LocalTime;

public class FundamentalTest {
    /**
     * The number and  abbreviation  of the month
     */
    public static final int Month = 10;
    public static final String[] MonthName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void main(String[] args) {
    System.out.println("hello world");
    System.out.println(MonthName[Month-1]);

    /**
     * The line number of Star
     */
        print(10);
    }

    /**
     *Flashbacks output stars and time
     */
    public static void print(int n){
       final String Star = "*";
       for (int i = n;i >= 1; i--){
           for (int j = 0;j < i; j++){
               System.out.print(Star);
           }
           System.out.println();
       }
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalDate is :" + localDate);
        System.out.println("LocalTime is :" + localTime);
    }
}
