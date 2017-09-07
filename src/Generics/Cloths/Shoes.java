package Generics.Cloths;

public class Shoes extends Clothes{
    @Override
    public String getDescription() {
        return "czarne buty";
    }

    @Override
    public String getName() {
        return "buty";
    }

    @Override
    public String getSize() {
        return "42";
    }
}