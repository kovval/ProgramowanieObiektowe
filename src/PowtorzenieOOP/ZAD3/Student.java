package PowtorzenieOOP.ZAD3;

public class Student extends Person {
    private String _program;
    private int _year;
    private double _fee;

    public Student(String name, String adress, String program, int year, double fee) {
        super(name, adress);
        _program = program;
        _year = year;
        _fee = fee;
    }

    public String getProgram(){
        return _program;
    }
    public void setProgram(String program){
        _program = program;
    }
    public int getYear(){
        return  _year;
    }
    public void setYear(int year){
        _year = year;
    }
    public double getFee(){
        return _fee;
    }
    public void setFee(double fee){
        _fee = fee;
    }
    public String toString(){
        return String.format("Student[%s], program = %s, year = %d, fee = %.2f", super.toString(), getProgram(), getYear(), getFee());
    }


}
