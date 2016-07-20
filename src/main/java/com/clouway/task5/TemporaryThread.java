package com.clouway.task5;

/**
 * Created by borislav on 20.07.16.
 */

public class TemporaryThread extends Thread {
    private int units;
    private int unitTimeInMilliseconds;

    public TemporaryThread(int units, int unitTimeInMilliseconds) {
        this.units = units;
        this.unitTimeInMilliseconds = unitTimeInMilliseconds;
    }

    public int getUnits() {
        return units;
    }

    public int getUnitTimeInMilliseconds() {
        return unitTimeInMilliseconds;
    }

    @Override
    public void run() {

        while(units > 0){
            try {
                sleep(unitTimeInMilliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            units--;
        }
        return;
    }
}
