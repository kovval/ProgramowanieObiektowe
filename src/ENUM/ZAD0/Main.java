package ENUM.ZAD0;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public enum GameMoves{PAPIER, KAMIEN, NOZYCE, Q}
    public enum GameStats{WYGRANA, REMIS, PRZEGRANA}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameMoves playerMove = GameMoves.KAMIEN;
        GameMoves cpuMove = GameMoves.KAMIEN;

        int remisy = 0;
        int zwyciestwa = 0;
        int porazki = 0;
        int liczbaGier = 0;

        while (!playerMove.equals(GameMoves.Q)) {
            System.out.printf("Podaj swój ruch:");
            String decision = sc.nextLine();
            switch (decision.toLowerCase()){
                case "n":
                    playerMove = GameMoves.NOZYCE;
                    break;
                case "k":
                    playerMove = GameMoves.KAMIEN;
                    break;
                case "p":
                    playerMove = GameMoves.PAPIER;
                    break;
                case "q":
                    playerMove = GameMoves.Q;
                    liczbaGier--;
                    break;
                default:
                    continue;
            }

            Random rand = new Random();

            switch (rand.nextInt(3)){
                case 0:
                    cpuMove = GameMoves.NOZYCE;
                    System.out.printf("Komputer zagrał nożycami\n");
                    break;
                case 1:
                    cpuMove = GameMoves.KAMIEN;
                    System.out.printf("Komputer zagrał kamieniem\n");
                    break;
                case 2:
                    cpuMove = GameMoves.PAPIER;
                    System.out.printf("Komputer zagrał papierem\n");
                    break;
            }

            GameStats result = amIWin(playerMove, cpuMove);

            if(result.equals(GameStats.REMIS))
                remisy++;
            else if(result.equals(GameStats.WYGRANA))
                zwyciestwa++;
            else
                porazki++;

            liczbaGier++;
        }

        System.out.printf("Zagrałeś %d gier. Wygrałeś: %d razy (%f). Przegrałeś: %d (%f)",
                liczbaGier, zwyciestwa, (double)zwyciestwa/liczbaGier*100, porazki, (double)porazki/liczbaGier*100);

    }

    public static GameStats amIWin(GameMoves playerMove, GameMoves cpuMove){
        if(playerMove.equals(GameMoves.KAMIEN) &&
                cpuMove.equals(GameMoves.KAMIEN))
            return GameStats.REMIS;

        if(playerMove.equals(GameMoves.KAMIEN) &&
                cpuMove.equals(GameMoves.NOZYCE))
            return GameStats.WYGRANA;

        if(playerMove.equals(GameMoves.KAMIEN) &&
                cpuMove.equals(GameMoves.PAPIER))
            return GameStats.PRZEGRANA;

        if(playerMove.equals(GameMoves.NOZYCE) &&
                cpuMove.equals(GameMoves.KAMIEN))
            return GameStats.PRZEGRANA;

        if(playerMove.equals(GameMoves.NOZYCE) &&
                cpuMove.equals(GameMoves.NOZYCE))
            return GameStats.REMIS;

        if(playerMove.equals(GameMoves.NOZYCE) &&
                cpuMove.equals(GameMoves.PAPIER))
            return GameStats.WYGRANA;

        if(playerMove.equals(GameMoves.PAPIER) &&
                cpuMove.equals(GameMoves.KAMIEN))
            return GameStats.WYGRANA;

        if(playerMove.equals(GameMoves.PAPIER) &&
                cpuMove.equals(GameMoves.NOZYCE))
            return GameStats.PRZEGRANA;

        if(playerMove.equals(GameMoves.PAPIER) &&
                cpuMove.equals(GameMoves.PAPIER))
            return GameStats.REMIS;


        return GameStats.REMIS;
    }
}