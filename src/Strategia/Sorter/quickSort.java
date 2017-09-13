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





//    public static void main(String[] args) {
//        int i, liczba;
//        Scanner sc = new Scanner(System.in);
//        Random rd = new Random();
//
//        System.out.println("Ile liczb chesz posortowac: ");
//
////        count = sc.nextInt();
//        count = 20;
//        _tablica = new int[count];
//        for(i=0; i<count; i++) {
//            _tablica[i] = rd.nextInt(50);
//        }
//
//        System.out.print("Tablica przed posortowaniem: ");
//        for(i=0; i<count; i++) {
//            System.out.print(_tablica[i] + " ");
//            quicsort(_tablica, 0, count - 1);
//        }
//        System.out.println();
//        System.out.print("Tablica po posortowaniu: " + " ");
//        for(i=0; i<count; i++)
//            System.out.print(_tablica[i]+" ");
//
//    }
//
//}


