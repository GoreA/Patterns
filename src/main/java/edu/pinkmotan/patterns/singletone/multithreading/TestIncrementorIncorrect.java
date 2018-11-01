package edu.pinkmotan.patterns.singletone.multithreading;

/**
 *
 * @author AlGore
 */
public class TestIncrementorIncorrect implements Runnable{

    public static int counter = 0;

    public static void main(String[] args) {

        TestIncrementorIncorrect te = new TestIncrementorIncorrect();
        Thread thread1 = new Thread(te);
        Thread thread2 = new Thread(te);

        thread1.start();
        thread2.start();


    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            incrementCounter();
        }
        System.out.println(counter);
    }

    static void incrementCounter() {
        counter++;
    }
}
