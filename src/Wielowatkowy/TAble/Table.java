package Wielowatkowy.TAble;


import java.util.ArrayList;


public class Table implements Runnable {
    int[] array;
    int[] idxForThread;
    int threadNumber;

    static ArrayList<Integer> maxForThreads = new ArrayList<>();

    public Table(int[] array, int threads, int threadNumber) {
        this.array = array;
        idxForThread = prepare(threads);
        this.threadNumber = threadNumber;
    }

    public void serchForMaxInFragment() {
        int max = Integer.MIN_VALUE;
        for (int i = idxForThread[threadNumber - 1]; i < idxForThread[threadNumber]; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        maxForThreads.add(max);
    }

    public int[] prepare(int threads) {

        int z = (int) Math.ceil((double) array.length / threads);
        int[] threadsIdxs = new int[threads + 1];
        for (int i = 0; i < threads + 1; i++) {
            threadsIdxs[i] = z * (i);
        }
        return threadsIdxs;
    }

    @Override
    public void run() {
        serchForMaxInFragment();
    }
}
