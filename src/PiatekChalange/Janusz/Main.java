package PiatekChalange.Janusz;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println();
//            for (int j = 10; j > i ; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" *");
//            }
//        }

        Browary browary = new Browary();
        Kibel kibel = new Kibel();
        Komorka komorka = new Komorka();
        Lopata lopata = new Lopata();
        Parawan parawan = new Parawan();
        SrajTasma srajTasma = new SrajTasma();
        Zabawki zabawki = new Zabawki();

        FasadaJanusz janusz = new FasadaJanusz(browary, kibel, komorka, lopata, parawan, srajTasma, zabawki);

        janusz.pobudka();
        Thread.sleep(10000);
        janusz.idzNaPlaze();
        Thread.sleep(10000);
        janusz.rostawsprzet();
        Thread.sleep(3100000);
        janusz.czekajNarodzine();

    }
}
