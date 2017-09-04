package PowtorzenieOOP.ZAD3;

public class Person {
    private String _name;
    private String _address;

    public Person(String name, String adress){
        _name = name;
        _address = adress;
    }
    public String getName(){
        return _name;
    }
    public String getAdress(){
        return _address;
    }

    public void setAdress(String adress){
        _address = adress;
    }

    public String toString(){
        return String.format("Person[name = %s, adress = %s", getName(), getAdress());
    }


}
