package PowtorzenieOOP.ZAD3;

public class Main {


    public static void main(String[] args) {

        Student adam = new Student("adam", "wilcze doly", "pozdrowienia dla profesorow", 123, 12.23);
        Staff ksa = new Staff("wyzsze", "pomyłka", "kooncepcyjne", 12.99);



        System.out.println(ksa.toString());

    }
}
