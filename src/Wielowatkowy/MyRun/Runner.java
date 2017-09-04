package Wielowatkowy.MyRun;

/**
 * Created by RENT on 2017-09-04.
 */
public abstract class Runner {
    public static void main(String[] args) {
        java.lang.Runnable[] runners = new java.lang.Runnable[10];
        Thread[] threads = new Thread[10];
        for(int i=0; i<10; i++) {

        }
        for(int i=0; i<10; i++) {
            threads[i] = new Thread(runners[i]);
        }
        for(int i=0; i<10; i++) {
            threads[i].start();
        }
    }

    public abstract void run();
}