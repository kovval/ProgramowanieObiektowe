package Strategia.UstrzelKaczora;

/**
 * Created by RENT on 2017-08-28.
 */
public class PlasticDuck extends Duck {

    public PlasticDuck(){
        latanie = new NieLataM();
        kwakanie = new PiszczeNieKwacze();
    }

    @Override
    public void showDuck(){
        System.out.println("Duck in bethroom");
    }

}
