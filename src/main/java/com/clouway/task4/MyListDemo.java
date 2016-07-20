package com.clouway.task4;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */

public class MyListDemo {

    public static void main(String [] args) throws InterruptedException {
        MyList list = new MyList();
        boolean flag = true;
        String usedBy = "";

        Thread add = new AddingThread(list);
        RemovingThread remove = new RemovingThread(list);

        add.start();
        remove.start();
    }
}
