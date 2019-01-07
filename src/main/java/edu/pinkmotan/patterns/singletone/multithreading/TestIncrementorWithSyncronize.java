package edu.pinkmotan.patterns.singletone.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author AlGore
 */
public class TestIncrementorCorrect implements Runnable{

    public static int instanceCounter = 0;

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            exec.execute(new TestIncrementorCorrect());
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            instanceCounter  = Incrementor.INSTANCE.incrementInstanceCounter();
        }
        System.out.println(instanceCounter);
    }
}
