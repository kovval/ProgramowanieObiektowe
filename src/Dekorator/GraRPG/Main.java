package Dekorator.GraRPG;

public class Main {

    public static void main(String[] args) {


     //Tarcza
       MadagaskarskaTarczaZKosciLEmorow mad = new MadagaskarskaTarczaZKosciLEmorow();
       PlytkiOCB asd = new PlytkiOCB(mad);
       ObsydianowaKupaLemura okl = new ObsydianowaKupaLemura(asd);
       BlachaWarszawskichTaksowek bW = new BlachaWarszawskichTaksowek(okl);

       //Miecz
       PraslowianskiMieczPierwszychPiastow pmp = new PraslowianskiMieczPierwszychPiastow();
       dumaPolskichDresiarzy dP = new dumaPolskichDresiarzy(pmp);

       //Plecak
        ZoladekElefanta ze = new ZoladekElefanta();
       Bohater bohater = new Bohater("JanKi sprawiedliwy i elekwentny", bW.pobierzOpis(), dP.pobierzOpis(), ze.pobierzOpisz(), bW.obrona(), dP.atak(), ze.ladunek() );

        System.out.printf("Bohater: %s\n" +
                "wyposażony w: %s\n" +
                "dzierżący %s\n" +
                "noszący: %s" +
                "\n===============================================================================\n" +
                "Statystyki: Obrona: %.2f, atak: %.1f, plecak: %.2f",
                bohater.getImie(), bohater.getTarczaOpis(), bohater.getMiecz(), bohater.getPlecakOpis(),
                bohater.getTarcza(), bohater.getAtak(), bohater.getPlecak());


    }
}
