package com.clouway.task1;

import java.util.Scanner;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */

public class CounterDemo {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Thread counter = new Counter(10);
        counter.start();
        sc.nextLine();
        counter.interrupt();
    }
}
