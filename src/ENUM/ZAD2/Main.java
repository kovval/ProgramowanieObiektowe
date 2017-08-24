package ENUM.ZAD2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-24.
 */
public class Main {

    public enum GameMoves {PAPIER, KAMIEN, NOZYCE, Q}

    public enum GameStats {WYGRANA, REMIS, PRZEGRANA}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        GameMoves playerMove = GameMoves.KAMIEN;
        GameMoves cpuMoves = GameMoves.KAMIEN;

        int remisy = 0;
        int zwycieztwa = 0;
        int porazki = 0;
        int liczbagier = 0;

        while (!playerMove.equals(GameMoves.Q)) {
            System.out.printf("Podaj swój ruch");
            String decision = sc.nextLine();
            switch (decision) {
                case "k":
                    playerMove = GameMoves.KAMIEN;
                    break;
                case "n":
                    playerMove = GameMoves.NOZYCE;
                    break;
                case "p":
                    playerMove = GameMoves.PAPIER;
                    break;
                case "q":
                    playerMove = GameMoves.NOZYCE.Q;
                default:
                    continue;
            }


            switch (rd.nextInt(2)) {
                case 0:
                    cpuMoves = GameMoves.KAMIEN;
                    System.out.printf("kompouter Kamien");
                    break;
                case 1:
                    cpuMoves = GameMoves.NOZYCE;
                    System.out.printf("kompouter Nozyce");
                    break;
                case 2:
                    cpuMoves = GameMoves.PAPIER;
                    System.out.printf("kompouter papier");
                    break;
                default:
                    continue;
            }
            GameStats result = amIWin(playerMove,cpuMoves );
            if(result.equals(GameStats.REMIS))
                remisy++;
            else if(result.equals(GameStats.WYGRANA))
                zwycieztwa++;
            else
                porazki++;

         liczbagier++;
        }

    }

    public static GameStats amIWin(GameMoves playerMove, GameMoves cpuMoves) {
        if (playerMove.equals(GameMoves.KAMIEN) && cpuMoves.equals(GameMoves.KAMIEN)) {
            return GameStats.REMIS;
        }
        if (playerMove.equals(GameMoves.KAMIEN) && cpuMoves.equals(GameMoves.PAPIER)) {
            return GameStats.PRZEGRANA;
        }
        if (playerMove.equals(GameMoves.KAMIEN) && cpuMoves.equals(GameMoves.NOZYCE)) {
            return GameStats.WYGRANA;
        }
        if (playerMove.equals(GameMoves.NOZYCE) && cpuMoves.equals(GameMoves.KAMIEN)) {
            return GameStats.PRZEGRANA;
        }
        if (playerMove.equals(GameMoves.NOZYCE) && cpuMoves.equals(GameMoves.PAPIER)) {
            return GameStats.WYGRANA;
        }
        if (playerMove.equals(GameMoves.NOZYCE) && cpuMoves.equals(GameMoves.NOZYCE)) {
            return GameStats.REMIS;
        }
        if (playerMove.equals(GameMoves.PAPIER) && cpuMoves.equals(GameMoves.KAMIEN)) {
            return GameStats.WYGRANA;
        }
        if (playerMove.equals(GameMoves.PAPIER) && cpuMoves.equals(GameMoves.PAPIER)) {
            return GameStats.REMIS;
        }
        if (playerMove.equals(GameMoves.PAPIER) && cpuMoves.equals(GameMoves.NOZYCE)) {
            return GameStats.PRZEGRANA;
        }

        return null;
    }

}

