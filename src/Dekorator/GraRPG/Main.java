package Dekorator.GraRPG;

public class Main {

    public static void main(String[] args) {


     //Tarcza
       MadagaskarskaTArczaZKosciLEmorow mad = new MadagaskarskaTArczaZKosciLEmorow();
       PlytkiOCB asd = new PlytkiOCB(mad);
       ObsydianowaKupaLemura okl = new ObsydianowaKupaLemura(asd);

       //Miecz
       PraslowianskiMieczPierwszychPiastow pmp = new PraslowianskiMieczPierwszychPiastow();


       Bohater bohater = new Bohater("Jan", okl.pobierzOpis(), pmp.pobierzOpis(), pmp.atak() );





//        System.out.printf("Nazwa tarczy: %s ::", pock.pobierzOpis());
        System.out.println("Bohater:" +  bohater.getImie()+ " Wyposażony w " + bohater.getTarcza()+ "dzierżączy " + bohater.getAtak());
//        System.out.println("Statytyki: Obrona: " + bohater.getAtak());




    }
}
