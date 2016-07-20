package com.clouway.task2;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */
public class CounterThreadDemo {

    public static void main(String [] args){

        CounterThread one = new CounterThread(0, 5, "Thread1", 900);
        CounterThread two = new CounterThread(0, 15, "Thread2", 1000);

        one.setThread(two);
        two.setThread(one);

        one.start();
        two.start();
    }

}
