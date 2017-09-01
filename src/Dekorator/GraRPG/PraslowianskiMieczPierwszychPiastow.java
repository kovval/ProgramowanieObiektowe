package Dekorator.GraRPG;

public class PraslowianskiMieczPierwszychPiastow extends Miecz {
    private Miecz _miecz;

    public PraslowianskiMieczPierwszychPiastow() {
        super.opis = "Praslowianski Miecz Prasłowianskich Piastow";
    }

    @Override
    public double atak() {
        return _miecz.atak() + 300;
    }
}
