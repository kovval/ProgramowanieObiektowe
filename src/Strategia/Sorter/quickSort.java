package Strategia.Sorter;

public class quickSort implements ISort {

    @Override
    public int[] sort(int[] tab) {
        quicksort(tab, 0, tab.length-1);
        return tab;
    }

    private static void quicksort(int tablica[], int left, int right) {
        int i = left;
        int j = right;
        int temp;
        int v = tablica[(left + right) / 2];
        do {
            while (tablica[i] < v) i++;
            while (tablica[j] > v) j--;
            if (i <= j) {
                temp = tablica[i];
                tablica[i] = tablica[j];
                tablica[j] = temp;
                i++;
                j--;
            }
        }
        while (i <= j);
        if (left < j) quicksort(tablica, left, j);
        if (i < right) quicksort(tablica, i, right);
    }
}

