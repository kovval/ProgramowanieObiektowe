package ZabawyZInterfacem.Pojazd;

/**
 * Created by RENT on 2017-08-23.
 */
public class Rower implements IDwukolowy {
    @Override
    public void jedz() {
        System.out.printf("jadę rowerem\n");
    }

    @Override
    public void hamuj() {
        System.out.printf("hamuję hamulcem tarczowym\n");
    }

    @Override
    public void przewrocSie() {
        System.out.printf("Ja się nie przewracam, tylko szukam dąże do optymalnego rozkładu środka ciezkości\n");

    }
}
