package ZabawyZInterfacem.DziadekiBabcia;

/**
 * Created by RENT on 2017-08-23.
 */
public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Za moich czasów!\n");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.printf("wali laską w ryj!\n");
    }

    public void zapalPapierosa(){
        System.out.printf("Pali Szluga...\n");
    }

    @Override
    public void upieczSzarlotke() {
        System.out.printf("slaba szarlotka\n");
    }
}
