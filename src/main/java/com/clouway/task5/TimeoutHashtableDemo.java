package com.clouway.task5;

import java.util.Scanner;

/**
 * Created by borislav on 20.07.16.
 */
public class TimeoutHashtableDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Object checker;
        TimeoutHashtable hashtable = new TimeoutHashtable();
        TemporaryThread threadOne = new TemporaryThread(60, 1000);
        TemporaryThread threadTwo = new TemporaryThread(20, 600);
        TemporaryThread threadThree = new TemporaryThread(70, 100);

        hashtable.put("first", threadOne);
        hashtable.put("second", threadTwo);
        hashtable.put("third", threadThree);

        sc.nextLine();

        checker = hashtable.get("first");
        if(checker != null){
            System.out.println("Thread with key -> first: is ALIVE!");
        }else {
            System.out.println("Thread with key -> first: DEAD or never EXISTED!");
        }

        checker = hashtable.get("second");
        if(checker != null){
            System.out.println("Thread with key -> second: is ALIVE!");
        }else {
            System.out.println("Thread with key -> second: DEAD or never EXISTED!");
        }

        checker = hashtable.get("third");
        if(checker != null){
            System.out.println("Thread with key -> third: is ALIVE!");
        }else {
            System.out.println("Thread with key -> third: DEAD or never EXISTED!");
        }
    }
}
