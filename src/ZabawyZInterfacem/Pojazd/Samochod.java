package ZabawyZInterfacem.Pojazd;

/**
 * Created by RENT on 2017-08-23.
 */
public class Samochod implements ICzterokolowy {
    @Override
    public void jedz() {
        System.out.printf("jadę samochodem\n");
    }

    @Override
    public void hamuj() {
        System.out.printf("hamuję pedałem\n");
    }

    @Override
    public void JEDZNACZOLOWKE() {
        System.out.printf("Pojechałem na cozłówkę\n");

    }
}
