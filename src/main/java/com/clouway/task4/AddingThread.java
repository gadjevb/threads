package com.clouway.task4;

import java.util.Random;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */
public class AddingThread extends Thread{
    private MyList list;
    private int min = 1;
    private int max = 1000;

    public AddingThread(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        Random number = new Random();

        while(true) {
            int producerInput = number.nextInt(101);
            list.add(producerInput);
            int sleep = min + (int)(Math.random() * (max - min) + 1);
            try {
                sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
