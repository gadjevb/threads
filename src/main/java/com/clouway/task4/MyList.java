package com.clouway.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */

public class MyList {

    private Scanner sc = new Scanner(System.in);
    private List<Object> myList = new ArrayList<>(5);

    public synchronized void add(){

        if(myList.size() == 5){
            System.out.println("List is full, please remove an element first!");
            int index = sc.nextInt();
            sc.nextLine();
            remove();

        }else{
            Object object = sc.nextInt();
            myList.add(object);
            System.out.println("Object " + object + " was added to the list!");
            notifyAll();
        }
    }

    public synchronized void remove(){

        if(myList.isEmpty()){
            System.out.println("List is empty, please add an element first!");
            add();
        }else{
            int index = sc.nextInt();
            myList.remove(index);
            System.out.println("Object at index " + index + " was removed from the list!");
            notifyAll();
        }
    }
}
