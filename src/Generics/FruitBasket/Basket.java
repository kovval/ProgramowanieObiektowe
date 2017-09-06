package Generics.FruitBasket;

/**
 * Created by RENT on 2017-09-06.
 */
public class Basket <T extends IFruits>{
    T _fruit;

    public T getFruit(){
        return _fruit;
    }
    public void setFruit(T fruit){
        _fruit = fruit;
    }

    public String getFruitColor(){
        return _fruit.getColor();
    }
    public String getName(){
        return _fruit.getName();
    }
}
