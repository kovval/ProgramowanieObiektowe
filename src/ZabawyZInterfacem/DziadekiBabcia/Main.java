package ZabawyZInterfacem.DziadekiBabcia;

/**
 * Created by RENT on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print(Emeryt.ILOSC_OCZU);

        Dziadek dziadek = new Dziadek();
        dziadek.zapalPapierosa();
        dziadek.krzyczNaDzieci();

        Emeryt babcia = new Babcia();
        babcia.upieczSzarlotke();
        babcia.biegnijDoSklepu(25, 32);

        Emeryt dziadek1 = new Dziadek();
        dziadek1.upieczSzarlotke();









    }



}
