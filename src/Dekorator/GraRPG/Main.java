package Dekorator.GraRPG;

public class Main {

    public static void main(String[] args) {
       AzbestowaTarcza at = new AzbestowaTarcza();
       PlytkiOCB pock = new PlytkiOCB(at);
        Tarcza tarcza = new Tarcza();


        System.out.printf("Nazwa tarczy: %s ::", pock.pobierzOpis());





    }
}
