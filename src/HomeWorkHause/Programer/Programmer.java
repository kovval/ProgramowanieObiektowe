package HomeWorkHause.Programer;

public class Programmer {
    private String _name;
    private String _surname;
    private String _favoriteCodingLanguage;
    private int _skillLevel = 1;

    public Programmer(String name, String surname){
        _name = name;
        _surname = surname;
    }

    public Programmer(String name, String surname, String favoriteCodingLanguage){
        _name = name;
        _surname = surname;
        _favoriteCodingLanguage = favoriteCodingLanguage;
    }

    public Programmer(String name, String surname, String favoriteCodingLanguage, int skillLevel){
        _name = name;
        _surname = surname;
        _favoriteCodingLanguage = favoriteCodingLanguage;
        _skillLevel = skillLevel;
    }
    public String getName(){
        return _name;
    }
    public void setName(String name){
        _name = name;
    }
    public String getSurname(){
        return _surname;
    }
    public void setSurname(String surname){
        _surname = surname;
    }
    public void changePersonalData(String name, String surname) {
        _name = name;
        _surname = surname;
    }
    public String getPersonalData(){
        return String.format("Programer[name = %s, surname= %s]", getName(), getSurname());
    }
    public String getFavoriteCodingLanguage(){
        return _favoriteCodingLanguage;
    }
    public void setFavoriteCodingLanguage(String favoriteCodingLanguage){
        _favoriteCodingLanguage = favoriteCodingLanguage;
    }
    public void learn(int skillLevel) {
        if (skillLevel <= 1) {
            skillLevel++;
        }
        if (skillLevel >= 10) {
            System.out.println("you have max level in this program language");
        } else {
            System.out.println(" i dont know how it possible, tou are under basic level");
        }
    }
    public int getSkillLevvel() {
        return _skillLevel;
    }
    public String toString(){
        return String.format("Programer[name %s, surname= %s, language= %s, skillLevel= %d", getName(), getSurname(), getFavoriteCodingLanguage(), getSkillLevvel());
    }


    }




