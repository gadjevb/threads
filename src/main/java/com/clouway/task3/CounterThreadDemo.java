package com.clouway.task3;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */

public class CounterThreadDemo {

    public static void main(String [] args){
        Counter count = new Counter();
        CounterThread one = new CounterThread(0, 5, "Thread1", 500, count);
        CounterThread two = new CounterThread(0, 10, "Thread2", 500, count);

        one.setThread(two);
        two.setThread(one);

        one.start();
        two.start();
    }

}
