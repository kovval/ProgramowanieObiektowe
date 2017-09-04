package Wielowatkowy.Threed;

import java.util.List;

/**
 * Created by RENT on 2017-09-04.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {


        long currentTime = System.currentTimeMillis();
        ListThreads lt = new ListThreads();
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        lt.process();
        t1.run();
        t2.run();

        t1.join();
        t2.join();

        System.out.println(System.currentTimeMillis()-currentTime);
    }
}
