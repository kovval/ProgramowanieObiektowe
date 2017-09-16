package PiatekChalange.KON;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        KonBonifacy ciag = new KonBonifacy(new Parzyste());

        int liczbalosowan = 50;
        int[] tabToCiag = new int[liczbalosowan];

        Random rd = new Random();
        for(int i = 0; i < liczbalosowan; i++){
            tabToCiag[i] = rd.nextInt(200)-100;
        }
        int[] ciagZliczony = ciag.uruchom(tabToCiag);

        for(int i = ciagZliczony.length-1; i >= 0; i--){
            System.out.print(ciagZliczony[i] + " ");
        }
        System.out.println();
        for(int element : ciagZliczony){
            System.out.print(element+" ");
        }
    }
}
