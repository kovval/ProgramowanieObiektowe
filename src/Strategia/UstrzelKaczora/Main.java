package Strategia.UstrzelKaczora;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        Duck vK = new DuckWabic();
        Duck dT = new premier();
        Duck pD = new PlasticDuck();
        Duck kM = new DuckModel();
        Duck dV = new DuckWabic();


        dT.showDuck();
        dT.wykonajKwakanie();
        dT.wykonajLatanie();
        pD.wykonajKwakanie();
        pD.wykonajLatanie();
        vK.wykonajKwakanie();
        vK.wykonajLatanie();
        vK.showDuck();
        kM.wykonajLatanie();
        kM.setLatanie(new LatanieRakietowe());
        kM.wykonajLatanie();
        kM.wykonajKwakanie();
        dT.setKwakanie(new PiszczeNieKwacze());
        dT.getKwakanie();
        dT.wykonajKwakanie();

        dV.showDuck();
        dV.setKwakanie(new PiszczeNieKwacze());
        dV.wykonajKwakanie();
        dV.setLatanie(new NieLataM());
        dV.wykonajLatanie();






    }
}
