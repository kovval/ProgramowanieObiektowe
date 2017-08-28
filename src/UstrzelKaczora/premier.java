package UstrzelKaczora;

/**
 * Created by RENT on 2017-08-28.
 */
public class premier extends Duck {
    public premier(){
        latanie = new LatamBoMoge();
        kwakanie = new KwaczeBoMoge();
    }
    @Override
    public void showDuck() {
        System.out.println("duck leave to better lands");
    }

}
