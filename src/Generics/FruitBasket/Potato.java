package Generics.FruitBasket;

/**
 * Created by RENT on 2017-09-06.
 */
public class Potato extends Basket implements IFruits {
    @Override
    public String getName() {
        return "Ziemniak";
    }

    @Override
    public String getColor() {
        return "braz";
    }
}
