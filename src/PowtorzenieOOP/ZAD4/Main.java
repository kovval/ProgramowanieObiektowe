package PowtorzenieOOP.ZAD4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public enum gameRand{ORZEL, RESZKA, Q}
    public enum GameStat{WYGRANA, PRZEGRANA, KONIEC}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        gameRand playerCheak = gameRand.ORZEL;
        gameRand cpuRand = gameRand.ORZEL;

        int zwyciestwa = 0;
        int porazki = 0;
        int liczbaGier = 0;

        while (!playerCheak.equals(gameRand.Q)){
            System.out.printf("Podaj los");
            String choose = sc.nextLine();
            switch (choose.toLowerCase()){
                case "o":
                    playerCheak = gameRand.ORZEL;
                    break;
                case "r":
                    playerCheak = gameRand.RESZKA;
                    break;
                case "q":
                    playerCheak = gameRand.Q;
                    liczbaGier--;
                    break;
                default:
                    continue;
            }
            Random rand = new Random();

            switch (rand.nextInt(2)){
                case 0:
                cpuRand = gameRand.ORZEL;
                    System.out.println("Komputer wybrał orła");
                    break;
                case 1:
                    cpuRand = gameRand.RESZKA;
                    System.out.println("Komputer wybrał reszke");
                    break;
            }

            GameStat result = amIWin(playerCheak, cpuRand);
            if(result.equals(GameStat.PRZEGRANA))
                zwyciestwa++;
            else
                porazki++;

            liczbaGier++;
        }

        System.out.printf("Zagrałeś %d gier. Wygrałeś: %d razy (%f). Przegrałeś: %d (%f)",
                liczbaGier, zwyciestwa, (double)zwyciestwa/liczbaGier*100, porazki, (double)porazki/liczbaGier*100);


    }

    public static GameStat amIWin(gameRand playerChoos, gameRand cpuRand){
        if(playerChoos.equals(gameRand.ORZEL) && cpuRand.equals(gameRand.ORZEL)){
            return GameStat.WYGRANA;
        }
        if(playerChoos.equals(gameRand.ORZEL) && cpuRand.equals(gameRand.ORZEL)){
            return GameStat.WYGRANA;
        }
        if(playerChoos.equals(gameRand.RESZKA) && cpuRand.equals(gameRand.ORZEL)){
            return GameStat.PRZEGRANA;
        }
        if(playerChoos.equals(gameRand.ORZEL) && cpuRand.equals(gameRand.RESZKA)) {
            return GameStat.PRZEGRANA;
        }

        return GameStat.KONIEC;
    }
}
