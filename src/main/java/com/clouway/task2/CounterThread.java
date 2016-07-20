package com.clouway.task2;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */
public class CounterThread extends Thread {
    private final int to;
    private final String name;
    private final int sleep;
    private int from;
    private CounterThread enemy;

    public CounterThread(int from, int to, String name, int sleep) {
        this.to = to;
        this.from = from;
        this.name = name;
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
            from++;
        }
        enemy.interrupt();
    }
}
