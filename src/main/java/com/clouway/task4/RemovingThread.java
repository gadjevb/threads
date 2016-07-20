package com.clouway.task4;

import java.util.Random;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */

public class RemovingThread extends Thread {
    private MyList list;

    public RemovingThread(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        Random number = new Random();
        while(true) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int consumerTakes = number.nextInt(list.getSize());
            list.remove(consumerTakes);
        }
    }
}
