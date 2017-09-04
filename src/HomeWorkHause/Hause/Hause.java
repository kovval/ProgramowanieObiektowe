package HomeWorkHause.Hause;

public class Hause {
    private String _number;
    private String _street;
    private String _city;
    private String _postalCode;
    private int _floors = 1;

    public Hause(String number, String street, String city, String postalCode) {
        _number = number;
        _street = street;
        _city = city;
        _postalCode = postalCode;
    }


    public Hause(String number, String street, String city, String postalCode, int floors) {
        _number = number;
        _street = street;
        _city = city;
        _postalCode = postalCode;
        _floors = floors;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String number) {
        _number = number;
    }

    public String getStreet() {
        return _street;
    }

    public void setStreet(String street) {
        _street = street;
    }

    public String getCityAndPostalCode() {

        return String.format("city = %s, postalCode = %s", _city, _postalCode);
    }

    public void setCityAndPostalCode(String city, String postalCode) {
        _city = city;
        _postalCode = postalCode;
    }


    public int getFloors() {
        return _floors;
    }

    public void setFloors(int floors) {
        _floors = floors;
    }

//    @Override
//    public String toString() {
//        return "Hause{" +
//                "_number='" + _number + '\'' +
//                ", _street='" + _street + '\'' +
//                ", _city='" + _city + '\'' +
//                ", _postalCode='" + _postalCode + '\'' +
//                ", _floors=" + _floors +
//                '}';
//    }

    public String toString() {
        return String.format("Hause[street = %s, number = %s, %s, floor = %s",
                getStreet(),
                getNumber(),
                getCityAndPostalCode(),
                getFloors());
    }


}
