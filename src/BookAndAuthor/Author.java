package BookAndAuthor;

/**
 * Created by RENT on 2017-08-21.
 */
public class Author {
    private String _name;
    private String _email;
    private Character _gender;

    public String getName() {
        return _name;
    }

    public String getEmail() {
        return _email;
    }

    public char getGender() {
        return _gender;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public  Author(String name, String email, Character gender){
        _name = name;
        _email = email;
        _gender = gender;
    }

    public String toString(){
        return "Author[name = "+ _name+" email= "+_email +", gender= "+_gender+"]";

    }


}
