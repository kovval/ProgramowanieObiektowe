package Generics.FruitBasket;

/**
 * Created by RENT on 2017-09-06.
 */
public class Main  {
    public static void main(String[] args) {
        Apple jablko = new Apple();
        Basket<Apple> fb = new Basket<>();
        Basket<Potato> pt = new Basket<>();

        fb.setFruit(jablko);
        System.out.println(fb.getName()+" "+ fb.getFruitColor());



    }
}
