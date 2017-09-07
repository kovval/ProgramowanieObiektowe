package Generics.Cloths;

public class Socks extends Clothes{
    @Override
    public String getDescription() {
        return "czarne skarpetki";
    }

    @Override
    public String getName() {
        return "skarpetki";
    }

    @Override
    public String getSize() {
        return "M";
    }
}