package ObserwatorWzorzec.Gazeta;

/**
 * Created by RENT on 2017-08-30.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {


        KaczorDonald kd = new KaczorDonald();
        Fakt f = new Fakt();

        JanK jk = new JanK(kd);

        kd.wydajNumer("Kd: 1/2017");
        Thread.sleep(4000);
        kd.wydajNumer("Kd: 2/2017");
        Thread.sleep(4000);
        kd.wydajNumer("Kd: 3/2017");
        Thread.sleep(4000);

       jk.rezygnujZGazety();
        System.out.println("KD KD Kd");
        Thread.sleep(4000);

        kd.wydajNumer("Kd: 3/2017");


    }
}
