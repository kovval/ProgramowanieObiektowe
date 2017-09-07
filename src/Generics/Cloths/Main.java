package Generics.Cloths;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Shoes shoes = new Shoes();
        TShirt tshirt = new TShirt();
        Suitcase<TShirt> suitcase =
                new Suitcase<>();
        suitcase.setThing(tshirt);
        System.out.println(suitcase.getThingName());
        System.out.println(suitcase.getThingSize());
        optionalChar("ttt", Optional.empty());
    }

    public static void optionalChar(String mm, Optional<String> dupa) {
        System.out.println(dupa);
    }
}