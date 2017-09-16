package PiatekChalange.Kalendarz;

public class Main {

    public static void main(String[] args) {


        Rusia rs = new Rusia();
        China ch = new China();
        Euro eu = new Euro();

        Kalendarz kl = new Kalendarz(eu);

        kl.drukujDzisiaj();
        kl.setKalendarz(rs);

       kl.drukujDzisiaj();
       kl.setKalendarz(ch);

        kl.drukujDzisiaj();


    }
}
