package PiatekChalange.Janusz;

public class FasadaJanusz {
    private Browary _browary;
    private Kibel _kibel;
    private Komorka _komorka;
    private Lopata _lopata;
    private Parawan _parawan;
    private SrajTasma _srajTasma;
    private Zabawki _zabawki;

    public FasadaJanusz(Browary browary, Kibel kibel, Komorka komorka, Lopata lopata, Parawan parawan, SrajTasma srajTasma, Zabawki zabawki) {
        _browary = browary;
        _kibel = kibel;
        _komorka = komorka;
        _lopata = lopata;
        _parawan = parawan;
        _srajTasma = srajTasma;
        _zabawki = zabawki;
    }


    public void pobudka(){
        _kibel.dwojka();
        _browary.wezPiwo();
        _browary.otworzPiwo();
        _browary.wypijPiwo();
        _browary.wezSzesciopak();
        _parawan.wezParawan();
        _komorka.wezTelefon();
        _zabawki.wezZabawki();
        _srajTasma.wezPapier();
        _lopata.wezLopate();
    }
    public void idzNaPlaze( ){
        _browary.otworzPiwo();
        _browary.wypijPiwo();
        _kibel.oddlejsie();
        _browary.otworzPiwo();
        _browary.wypijPiwo();
        _komorka.OdbierzOdGrazyny();
    }
    public void rostawsprzet(){
        _browary.otworzPiwo();
        _browary.wypijPiwo();
        _lopata.wykopDol();
        _parawan.rozstawParawan();
        _komorka.dzwonDoGrazyny();
        _zabawki.nadmuchajPilke();
    }
    public void czekajNarodzine(){
        _browary.otworzPiwo();
        _browary.wypijPiwo();
        _browary.otworzPiwo();
        _browary.wypijPiwo();
        _kibel.oddlejsie();
    }
    public void rodzinaPrzybyla(){
        _browary.otworzPiwo();
        _browary.wypijPiwo();
        _zabawki.pobawSieZDziecmi();
    }




}
