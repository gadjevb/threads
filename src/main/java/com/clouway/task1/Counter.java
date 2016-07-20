package com.clouway.task1;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */

public class Counter extends Thread {
    private final Integer to;
    private int from = 0;
    private boolean flag = true;

    public Counter(Integer to) {
        this.to = to;
    }

    public void run() {
        while (from < to && flag) {

            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("Counted to:" + from);
                return;
            }

            from++;
            System.out.println("current :" + from);

        }

        System.out.println("Counted to:" + from);
    }
}
