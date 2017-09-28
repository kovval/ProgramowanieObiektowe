package Generics.FruitBasket;

/**
 * Created by RENT on 2017-09-06.
 */
public class Strewbarry  extends Basket implements IFruits {
    @Override
    public String getName() {
        return "Truskawka";
    }

    @Override
    public String getColor() {
        return "red";
    }
}
