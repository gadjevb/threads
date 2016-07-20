package com.clouway.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */

public class MyList {

    private Scanner sc = new Scanner(System.in);
    private List<Object> myList = new ArrayList();

    public synchronized void add(Object object){
        while(myList.size() == 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Element:" + object + " was added!");

        myList.add(object);
        notifyAll();
    }

    public synchronized void remove(int index){
        while(myList.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Element:" + myList.get(index) + " at position " + index +  " was removed!");

        myList.remove(index);
        notifyAll();
    }

    public int getSize(){
        return myList.size();
    }
}
