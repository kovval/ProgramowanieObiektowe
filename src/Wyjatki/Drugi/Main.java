package Wyjatki.Drugi;

/**
 * Created by RENT on 2017-09-06.
 */
public class Main {
    public static void main(String[] args) {


        String[] strArr = new String[]{"zzzz", "dsa", "dfsd", "fds", "fwe", "fdsf"};
        word as = new word();
        try {
            as.findElement(strArr, "dwasd");
        }
        catch (Exception e){
            System.out.println("nie udalo sie");
            e.getLocalizedMessage();
            e.toString();
            e.getMessage();

        }

    }
}
