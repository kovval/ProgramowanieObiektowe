package PowtorzenieOOP.ZAD3;

public class Staff extends Person {
    private String _school;
    private double _pay;


    public Staff(String name, String adress, String school, double pay) {
        super(name, adress);
        _pay = pay;
        _school = school;
    }
    public String getSchool() {
        return _school;
    }

    public void setShool(String school) {
       _school = school;
    }

    public double getPay() {
        return _pay;
    }

    public void setPay(double pay) {
        _pay = pay;
    }

    public String toString(){
        return String.format("Staff[%s], school = %s, pay = %.2f", super.toString(), getSchool(), getPay());
    }

}
