package com.clouway.task1;

import java.util.Scanner;

public class Demo {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        Thread counter = new Counter(10);
        counter.start();

        sc.nextLine();

        counter.interrupt();


    }
}
