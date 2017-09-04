package Wielowatkowy.Threed;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by RENT on 2017-09-04.
 */
public class ListThreads implements Runnable {
    private ArrayList<Integer> _stageOne = new ArrayList<>();
    private ArrayList<Integer> _StageTwo = new ArrayList<>();
    private Random rand = new Random();

    public synchronized void StageOne() throws InterruptedException {
        _stageOne.add(rand.nextInt());
        Thread.sleep(1);
    }
    public synchronized void StageTwo() throws InterruptedException {
        _StageTwo.add(rand.nextInt());
        Thread.sleep(1);
    }
    public void process() throws InterruptedException {
        for(int i = 0; i < 1000; i++) {
            StageOne();
            StageTwo();
        }
    }


    @Override
    public void run() {
        pricess();
    }

    private void pricess() {
    }
}
