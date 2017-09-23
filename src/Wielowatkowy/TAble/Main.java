package Wielowatkowy.TAble;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args ) throws InterruptedException {
        Random rand = new Random(1);
        int[] array = rand.ints(50,0, 100).toArray();
//        int[] array = rand.ints(2).toArray();


        Table t1 = new Table(array, 5,1);
        Table t2 = new Table(array, 5, 2);
        Table t3 = new Table(array, 5, 3);
        Table t4 = new Table(array, 5, 4);
        Table t5 = new Table (array, 5, 5);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        Thread th4 = new Thread(t4);
        Thread th5 = new Thread(t5);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();

        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();

        System.out.println(Table.maxForThreads);


    }
}
