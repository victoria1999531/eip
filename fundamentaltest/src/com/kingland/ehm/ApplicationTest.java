package com.kingland.ehm;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {
    static int Consol ;
    static int File;

    public static void main(String[] args) {
        List<Integer> transfer = new ArrayList<Integer>(){
            {
               this.add(Consol);
               this.add(File);
            }

        };

    }
}
