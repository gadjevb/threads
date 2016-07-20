package com.clouway.task4;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */
public class MyListDemo {

    public static void main(String [] args) {
        MyList list = new MyList(5);

        Thread add = new AddingThread(list);
        RemovingThread remove = new RemovingThread(list);

        add.start();
        remove.start();
    }
}
