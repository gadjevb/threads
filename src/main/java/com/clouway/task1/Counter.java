package com.clouway.task1;

public class Counter extends Thread {

    private int countTo = 0;
    private int countingNumber = 0;
    private boolean flag = true;

    public Counter(int countTo){
        this.countTo = countTo;
    }

    public void run(){
        while(countingNumber < countTo && flag){

            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("Counted to:" + countingNumber);
                return;
            }

            countingNumber++;

        }

        System.out.println("Counted to:" + countingNumber);
    }
}
