package Dekorator.GraRPG;

public class MadagaskarskaTArczaZKosciLEmorow extends Tarcza {
    private Tarcza _tarcza;

    public MadagaskarskaTArczaZKosciLEmorow() {super.opis = "Madagaskarska Tarcza z kości lemórów";}

    @Override
    public double obrona() {
        return _tarcza.obrona()+30;
    }
}
