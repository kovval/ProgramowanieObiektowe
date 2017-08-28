package UstrzelKaczora;

/**
 * Created by RENT on 2017-08-28.
 */
public class DuckModel extends Duck{
    public DuckModel(){
        latanie = new LatamBoMoge();
        kwakanie = new NieKwaczeBoNieMoge();

    }
    @Override
    public void showDuck(){
        System.out.println("Model Duck");
    }
}
