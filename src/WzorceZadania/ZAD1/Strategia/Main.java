package WzorceZadania.ZAD1.Strategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        CiagLiczb ciagLiczb = new CiagLiczb(new LiczbaParzysta());
        int[] tabToCiag = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        int[] ciagZliczony = ciagLiczb.doCiag(tabToCiag);

        for(int i = ciagZliczony.length-1; i >= 0; i--){
            System.out.print(ciagZliczony[i] + " ");
        }
//        System.out.println();
//        for(int element : ciagZliczony){
//            System.out.print(element+" ");
//        }

    }
}