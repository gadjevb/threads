package com.clouway.task5;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *@author Borislav Gadjev <gadjevb@gmail.com>
 */
public class TimeoutHashtable {
    private Hashtable<String, TemporaryThread> temporaryThreads = new Hashtable(10, 0.20f);
    private Object checker;

    public void put(String key, TemporaryThread thread){
        cleaningLady();
        checker = temporaryThreads.get(key);
        if(checker != null){
            remove(key);
        }
        thread.start();
        temporaryThreads.put(key, thread);
    }

    public TemporaryThread get(String key){
        cleaningLady();
        checker = temporaryThreads.get(key);
        if(checker != null){
            TemporaryThread temporary = new TemporaryThread(temporaryThreads.get(key).getUnits(), temporaryThreads.get(key).getUnitTimeInMilliseconds());
            remove(key);
            temporary.start();
            temporaryThreads.put(key, temporary);
            return temporaryThreads.get(key);
        }
        return null;
    }

    public TemporaryThread remove(String key){
        cleaningLady();
        checker = temporaryThreads.get(key);
        if(checker != null){
            return temporaryThreads.remove(key);
        }
        return null;
    }

    private void cleaningLady(){
        Enumeration<String> keys = temporaryThreads.keys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            if(temporaryThreads.get(key).isAlive() == false){
                temporaryThreads.remove(key);
            }
        }
    }
}
