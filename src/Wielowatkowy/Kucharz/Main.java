package Wielowatkowy.Kucharz;

/**
 * Created by RENT on 2017-09-04.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Processor proc = new Processor();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();// musi rozpoczac kucharz
        t2.run();

        t1.join();
        t2.join();



    }
}
