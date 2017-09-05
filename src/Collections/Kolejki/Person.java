package Collections.Kolejki;

/**
 * Created by RENT on 2017-09-05.
 */
public class Person {
    private String _name;
    private String _shoppingList;

    public Person(String name, String shopping){
        _name = name;
        _shoppingList = shopping;
    }

    public String getName(){
        return  _name;
    }
    public String unpackShopping(){
        return "Wypakowuje na taśmociąg: " + _shoppingList;
    }
}
