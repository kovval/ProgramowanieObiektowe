package PiatekChalange.KON;



public class KonBonifacy {

    public IPobierzTablice oblicz;//agregacja interfejsu


    public KonBonifacy(IPobierzTablice oblicz) {
        this.oblicz = oblicz;
    }
    public int[] uruchom(int[] tab) {
        return oblicz.pobierz(tab);
    }

}
