package Dekorator.GraRPG;

/**
 * Created by RENT on 2017-08-30.
 */
public class Bohater {

    private  String _imie;
    private String _tarcza;
    private String _miecz;
    private double _atak;



    public String getImie() {
        return _imie;
    }

    public String getTarcza() {
        return _tarcza;
    }

    public String getMiecz(){ return  _miecz;}

    public double getAtak(){ return  _atak;}



    public Bohater(String imie, String tarcza, String miecz, double atak){
     _imie = imie;
     _tarcza = tarcza;
     _miecz = miecz;
     _atak = atak;
 }




}
