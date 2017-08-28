package UstrzelKaczora;

/**
 * Created by RENT on 2017-08-28.
 */
public class DuckWabic extends Duck {

    public DuckWabic(){
        latanie = new NieLataM();
        kwakanie = new NieKwaczeBoNieMoge();
    }

    @Override
    public void showDuck(){
        System.out.println("Duck vabic from wood");
    }
}
