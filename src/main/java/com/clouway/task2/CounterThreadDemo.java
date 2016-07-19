package com.clouway.task2;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */

public class CounterThreadDemo {
    public static int threadOneFrom = 0;
    public static int threadOneTo = 5;
    public static int threadTwoFrom = 0;
    public static int threadTwoTo = 15;


    public static Thread threadOne = new Thread(){

        @Override
        public void run() {
            while(threadOneFrom <= threadOneTo){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread1 was interrupted!");
                    return;
                }

                System.out.println("Thread1- " + threadOneFrom);

                threadOneFrom++;
            }

            threadTwo.interrupt();
        }
    };

    public static Thread threadTwo = new Thread(){

        @Override
        public void run() {
            while(threadTwoFrom <= threadTwoTo){

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread2 was interrupted!");
                    return;
                }

                System.out.println("Thread2- " + threadTwoFrom);

                threadTwoFrom++;
            }

            threadOne.interrupt();
        }
    };


    public static void main(String [] args){
        threadOne.start();
        threadTwo.start();

    }

}
