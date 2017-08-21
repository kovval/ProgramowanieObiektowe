package Data;

public class Data {
    private int _day;
    private int _month;
    private int _year;




    public Data(int day, int month, int year){
        _day = day;
        _month = month;
        _year = year;

    }

    public int getDay() {
        return _day;
    }

    public int getMonth() {
        return _month;
    }

    public int getYear() {
        return _year;
    }

    public void setDay(int day) {
       _day = day;
    }

    public void setMonth(int month) {
       _month = month;
    }

    public void setYear(int year) {
       _year = year;
    }
    public void setDate(int day, int month, int year) {
        _day = day;
        _month = month;
        _year = year;
    }
    public String toString(){
        return getDay()+"/"+getMonth()+"/"+getYear();
    }




}
