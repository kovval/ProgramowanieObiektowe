package ObserwatorWzorzec.StacjaPogodowa;

/**
 * Created by RENT on 2017-08-29.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe dp = new DanePogodowe();
        WarunkiBiezace wb = new WarunkiBiezace(dp);

        dp.ustawZmienne(11, 1030, 45);

        Thread.sleep(10000);

        dp.ustawZmienne(12,1020, 67);



    }
}
