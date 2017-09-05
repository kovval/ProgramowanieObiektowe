package Wielowatkowy.Cook;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cook tim = new Cook();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    tim.prepereTheDish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    tim.eatThedish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });


        t1.start();
        t2.run();

        t1.join();
        t2.join();
    }
}
