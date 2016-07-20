package com.clouway.task3;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */

public class CounterThread extends Thread {
    private final int to;
    private final String name;
    private final Counter count;
    private final int sleep;
    private int from;
    private CounterThread enemy;

    public CounterThread(int from, int to, String name, int sleep, Counter count) {
        this.to = to;
        this.from = from;
        this.name = name;
        this.count = count;
        this.sleep = sleep;
    }

    public void setThread(CounterThread thread){
        this.enemy = thread;
    }

    @Override
    public void run() {

        while (from <= to){

            try {
                sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted!");
                return;
            }

            System.out.println(name + "- " + from);
            from = count.increment(from);
        }
        enemy.interrupt();
    }
}
