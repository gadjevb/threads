package com.clouway.task3;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */

public class Counter {

    public synchronized int increment(int number){
        return ++number;
    }

}
