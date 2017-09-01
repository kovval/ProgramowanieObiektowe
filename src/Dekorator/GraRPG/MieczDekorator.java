package Dekorator.GraRPG;

public abstract class MieczDekorator extends Miecz{
    private Miecz _miecz;

    public abstract String PobierzOpis();

    @Override
    public double atak() {
        return _miecz.atak();
    }
}
