package Dekorator.GraRPG;

public class dumaPolskichDresiarzy extends MieczDekorator {

    private Miecz _miecz;

    public dumaPolskichDresiarzy(Miecz miecz) {_miecz = miecz;}

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " , błogosławiany dumą patriotyzmu prawdziwych patriotów dresiarzy";
    }

    @Override
    public double atak() {
        return _miecz.atak()+40.4;
    }
}
