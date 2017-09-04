package Wielowatkowy.synchronization;

/**
 * Created by RENT on 2017-09-04.
 */
public class Simplesynchronization {
    public static int counter;

    public synchronized void increment(){
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {
        Simplesynchronization mm = new Simplesynchronization();
        mm.doWork();

    }
    public static void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000000; i++) {
                    counter++;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000000; i++) {
                    counter++;
                }
            }
        });
        t1.run();
        t2.run();

        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
