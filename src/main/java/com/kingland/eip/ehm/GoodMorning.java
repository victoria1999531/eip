package com.kingland.eip.ehm;

public class GoodMorning {
    public static void main(String[] args){
        String str = "Good Morning";
        int len = length(str);
        if (len % 2 == 0) {
        System.out.println(len);
    }
    else if(len%2==1){
        System.out.println("String is odd!");
    }
}

    public static int length(String s){
        if(s.indexOf(" ")!=-1&&"G".equals(s.substring(0,1))){
            String[] newStr = s.split(" ");
            for (String string : newStr) {
                System.out.println(string);
            }
        }
        return s.length();
    }
}
