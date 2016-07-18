package com.clouway.task2;

public class Counter extends Thread {

    private int from = 0;
    private int to = 0;
    private Count count = null;
    private String name = "";

    public Counter(int from, int to, Count count, String name){
        this.from = from;
        this.to = to;
        this.count = count;
        this.name = name;
    }

    public void run(){

        while(from < to){

            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                return;
            }

            System.out.println(name + "- " + from);

            from = count.increment(from);
        }

    }

}
