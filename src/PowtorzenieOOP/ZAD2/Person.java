package PowtorzenieOOP.ZAD2;


public class Person {
    private String _name;
    private String _surname;
    private String _PESEL;
    private char _gender;
    private BirthDay _birthday;

    public Person(String name, String surname, String PESEL){
        _name = name;
        _surname = surname;
        _birthday = new BirthDay(PESEL);
        _gender = _birthday.getGender();
    }

    public String getName(){
        return _name;
    }

    public String getSurname(){
        return _surname;
    }

    public char getGender(){
        return _gender;
    }

    public int getBirthdayYear(){
        return _birthday.getYear();
    }

    public int getBirthdayMonth(){
        return _birthday.getMonth();
    }

    public int getBirthdayDay(){
        return _birthday.getDay();
    }

    public String getPESEL(){
        return _PESEL;
    }

    public long lifeLength(){
        return _birthday.calculateDays();
    }
}

