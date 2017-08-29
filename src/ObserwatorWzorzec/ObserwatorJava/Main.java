package ObserwatorWzorzec.ObserwatorJava;

/**
 * Created by RENT on 2017-08-29.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe dp = new DanePogodowe();
        WarunkiBiezace wb = new WarunkiBiezace(dp);

        dp.ustawZmienne(11, 1030, 45);

        Thread.sleep(5000);

        dp.ustawZmienne(12,1020, 67);
        Thread.sleep(4000);

        dp.ustawZmienne(15,1020, 67);

        Thread.sleep(3000);

        dp.ustawZmienne(12,1040, 67);
        Thread.sleep(1000);

        dp.ustawZmienne(12,123, 67);

    }
}
