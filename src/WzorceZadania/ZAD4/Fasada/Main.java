package WzorceZadania.ZAD4.Fasada;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        toNum303419 coc = new toNum303419();
        CukierPuder cp = new CukierPuder();
        Talk t = new Talk();

        FasadaMieszanki teodozja = new FasadaMieszanki(cp, t, coc);
        int pojemnoscPlecaka = 0;
        while (pojemnoscPlecaka < 15 ){
            teodozja.zrobCapsa();
            Thread.sleep(1500);
            teodozja.zrobMieszanke();
            pojemnoscPlecaka++;
        }
        System.out.println("pora iść handlować");

    }
}
