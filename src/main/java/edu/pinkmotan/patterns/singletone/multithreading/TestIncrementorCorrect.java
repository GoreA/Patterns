package edu.pinkmotan.patterns.singletone.multithreading;

/**
 *
 * @author AlGore
 */
public class TestIncrementorCorrect implements Runnable{

    public static int counter = 0;

    public static void main(String[] args) {

        TestIncrementorCorrect te = new TestIncrementorCorrect();
        Thread thread1 = new Thread(te);
        Thread thread2 = new Thread(te);

        thread1.start();
        thread2.start();


    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            counter  = Incrementor.INSTANCE.add(counter);
        }
        System.out.println(counter);
    }

}
