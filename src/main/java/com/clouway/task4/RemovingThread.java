package com.clouway.task4;

import java.util.Random;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */
public class RemovingThread extends Thread {
    private MyList list;
    private int min = 1;
    private int max = 1000;

    public RemovingThread(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        Random number = new Random();

        while(true) {
            int sleep = min + (int)(Math.random() * (max - min) + 1);
            try {
                sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(list.getSize() != 0) {
                int consumerTakes = number.nextInt(list.getSize());
                list.remove(consumerTakes);
            }
        }
    }
}
