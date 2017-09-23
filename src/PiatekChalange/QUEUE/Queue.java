package PiatekChalange.QUEUE;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Stack;

public class Queue {
    public static void main(String[] args) throws InterruptedException {
        String[] nazwiska2 = {"STEFANIAK", "SZULC", "Lesmian", "kochanowski", "KISIEL", "asert", "musiala"};

//        ArrayDeque kolejka = new ArrayDeque();
//        for (String o : nazwiska2) {
//            kolejka.add(o);
//        }
//            for (int i = kolejka.size(); i >= 1 ; i--) {
//            System.out.println(kolejka.element());
//            Thread.sleep(3000);
//        }

        Stack kolejka = new Stack();
        for (String o : nazwiska2) {
            kolejka.add(o);
        }
        for (int i = kolejka.size(); i >= 1 ; i--) {
            System.out.println(kolejka.pop());
            Thread.sleep(3000);
        }


    }
}
