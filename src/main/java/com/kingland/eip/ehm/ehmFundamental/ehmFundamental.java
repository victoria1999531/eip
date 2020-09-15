/*

 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.

 */
package com.kingland.eip.ehm.ehmFundamental;

import java.time.LocalDate;
import java.time.LocalTime;

public class ehmFundamental {
    /**
     * The number and  abbreviation  of the month
     */
    public static final int Month = 10;
 //1.Use Intellij to create a package called EhM, with the Improper printing of "Hello World" from a Java file called Primitive Altest.
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

    /*2.Write the code using the Java file you just created, do the following, print the pattern below, and say Java Doc,
        Print the current date and time below the pattern (using LocalDate and LocalTime)
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

    //3.An immutable int variable is defined to represent the month,
    // the initial month is October, in different months output corresponding month abbreviations.
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

    /*4.Define a method called in the main function that defines a string "Good Morning,"
        Pass the string as an argument into the defined method. If the string contains a space and the first letter of the string is G,
        Divide the string with a space, type out the two separated words, and make one word a line (using the form for each),
        The length of "Good Morning" will be the return value of this method. Finally, in main function, if the length is even, the length of the string will be printed.
        If the length is odd, the output will be "odd string".
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
