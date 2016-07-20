package com.clouway.task4;

import java.util.Random;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */

public class AddingThread extends Thread{
    private MyList list;

    public AddingThread(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        Random number = new Random();

        while(true) {
            int producerInput = number.nextInt(101);
            list.add(producerInput);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
