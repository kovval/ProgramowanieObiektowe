package ZabawyZInterfacem.Pojazd;

/**
 * Created by RENT on 2017-08-23.
 */
public class Motocykl implements IDwukolowy{

    @Override
    public void jedz() {
        System.out.printf("jadę na masyznie!\n");
    }

    @Override
    public void hamuj() {
        System.out.printf("Nigdy nie zahamuje!\n");
    }

    @Override
    public void przewrocSie() {
        System.out.printf("Ojoj boli!\n");
    }

        public void dodajGazu(){
            System.out.println("dodaj gazu\n");
    }

    }

