package Generics.Cloths;


public class TShirt
        extends Clothes
        implements ICanBeFolded{
    @Override
    public String getDescription() {
        return "biały tshirt";
    }

    @Override
    public String getName() {
        return "tshirt";
    }

    @Override
    public String getSize() {
        return "S";
    }
}