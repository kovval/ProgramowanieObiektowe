package PowtorzenieOOP.ZAD2;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class BirthDay {
    private int _day;
    private int _month;
    private int _year;

    private char _gender;

    public BirthDay(String PESEL){
        setDataBasedOnPesel(PESEL);
    }

    private void setDataBasedOnPesel(String PESEL){
        setDay(PESEL);
        setMonth(PESEL);
        setYear(PESEL);
        setGender(PESEL);
    }

    private void setYear(String PESEL){
        int twoLastDigits = Integer.parseInt(PESEL.substring(0, 2));
        int month = Integer.parseInt(PESEL.substring(2, 4));

        int year = twoLastDigits;
        if (month > 80 && month < 93) {
            year += 1800;
        }
        else if (month > 0 && month < 13) {
            year += 1900;
        }
        else if (month > 20 && month < 33) {
            year += 2000;
        }
//        else if (month > 40 && month < 53) {
//            year += 2100;
//        }
//        else if (month > 60 && month < 73) {
//            year += 2200;
//        }

        _year = year;
    }

    public int getYear(){
        return _year;
    }

    private void setMonth(String PESEL){
        int month = Integer.parseInt(PESEL.substring(2, 4));
        if (month > 80 && month < 93) {
            month -= 80;
        }
        else if (month > 20 && month < 33) {
            month -= 20;
        }
        else if (month > 40 && month < 53) {
            month -= 40;
        }
        else if (month > 60 && month < 73) {
            month -= 60;
        }
        _month = month;
    }

    public int getMonth(){
        return _month;
    }

    private void setDay(String PESEL){
        _day = Integer.parseInt(PESEL.substring(4, 6));
    }

    public int getDay(){
        return  _day;
    }

    private void setGender(String PESEL){
        _gender = Integer.parseInt(PESEL.substring(9,10)) % 2 == 0 ? 'W' : 'M';
        //Innymi słowy:
        //if(Integer.parseInt(PESEL.substring(9,10)) % 2 == 0)
        //{ _gender = 'W';}
        //else { _gender = 'M'; }
    }

    public char getGender(){
        return _gender;
    }

    public long calculateDays(){
        LocalDate now = LocalDate.now();
        LocalDate bithday = LocalDate.of(_year, _month, _day);

        return DAYS.between(bithday, now);
    }
}
