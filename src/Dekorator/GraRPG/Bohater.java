package Dekorator.GraRPG;

/**
 * Created by RENT on 2017-08-30.
 */
public class Bohater {

    private  String _imie;
    private String _tarczaOpis;
    private String _miecz;
    private String _plecakOpis;

    private double _tarcza;
    private double _atak;
    private double _plecak;



    public String getImie() {
        return _imie;
    }


    public String getTarczaOpis() {
        return _tarczaOpis;
    }

    public String getMiecz() {
        return _miecz;
    }

    public String getPlecakOpis() {
        return _plecakOpis;
    }

    public double getTarcza() {
        return _tarcza;
    }
    public double getAtak() {
        return _atak;
    }
    public double getPlecak() {
        return _plecak;
    }



    public Bohater(String imie, String tarcza, String miecz, String plecakOpis, double tar, double ata, double plecak){
     _imie = imie;
     _tarczaOpis = tarcza;
     _miecz = miecz;
     _tarcza = tar;
     _atak = ata;
     _plecakOpis = plecakOpis;
     _plecak = plecak;


 }




}
