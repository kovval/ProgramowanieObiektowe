package Wielowatkowy.Cook;

import java.util.Scanner;

public class Cook {

    private String[] demnark = {"appetizer", "soup" ,"entree", "dessert", "bill"};
    public void prepereTheDish() throws InterruptedException {
        synchronized (Cook.this) {
            for (int i = 0; i < 5; i++) {

                if(i == demnark.length-1)  System.out.printf("\nI issue the  %s", demnark[i]);
                else System.out.printf("\nI cook %s", demnark[i]);
                wait();
                if(i< demnark.length-1) System.out.println("Next Dinner!");
                notify();
                Thread.sleep(200);
            }
            System.out.print("\n Now is time to try by programer and catch better work");
        }
    }

    public void eatThedish() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(300);
        synchronized (Cook.this) {
            for (int i = 0; i < 5; i++) {
                if(i == demnark.length-1) System.out.printf("\ni pay %s", demnark[i]);
                else System.out.printf("\nEaiting for %s ", demnark[i]);
                sc.nextLine();
                if(i == demnark.length-1) System.out.printf("\n It's time to go home!");
                else System.out.println("Eaten!");
                notify();
                wait();
            }
        }
    }
}
