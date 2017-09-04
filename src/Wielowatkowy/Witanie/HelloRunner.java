package Wielowatkowy.Witanie;

/**
 * Created by RENT on 2017-09-04.
 */
public class HelloRunner implements Runnable {
    private int _id;
    private String[] name = {"Kamil", "Lukasz", "andrzej","stefan","janek","ela","kamikla","suka","kurwa", "Damian"} ;
    public HelloRunner(int id){_id = id;}
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
                System.out.printf("\nHello %s", name[_id]);
                if (_id == 9) {
                    System.out.printf("\nżegnaj %s", name[_id]);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

