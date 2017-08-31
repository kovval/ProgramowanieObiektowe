package Fasada.FasadaTunerWzmacniacz;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Telewizor tv = new Telewizor();
        Termomix tm = new Termomix();
        Tuner tu = new Tuner();
        WzmacniaczDVD dv = new WzmacniaczDVD();

        FasadaKinaDomowego jan = new FasadaKinaDomowego(tv, tm, dv, tu);

        jan.wrocDodomu();
        System.out.println("---------");
        Thread.sleep(5000);
        jan.wychodzZDomu();
    }
}
