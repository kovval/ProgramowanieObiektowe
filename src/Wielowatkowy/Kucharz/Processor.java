package Wielowatkowy.Kucharz;

import java.util.Scanner;

/**
 * Created by RENT on 2017-09-04.
 */
public class Processor {

    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("producer thread is running!");
            wait();
            System.out.println("resumed!");
        }

    }

    public void consume() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Waiting for ENTER");
            sc.nextLine();
            System.out.println("ENTER pressed");
            notify();
        }

    }
}
