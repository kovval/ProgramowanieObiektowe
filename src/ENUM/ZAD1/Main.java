package ENUM.ZAD1;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by RENT on 2017-08-24.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rd = new Random();
        int wyborCom = rd.nextInt(2);





        String exit = "";
        while(!exit.equals("y")) {

            System.out.println("wybierz:\n k - kamien\n p - papier \n n - nożyce");
            String wybieram = sc.nextLine();

            int com = rd.nextInt(2);
            System.out.printf("komputer wybierze %d\n", com);




            System.out.println("Ty wybrałeś: ");

            System.out.println(wybieram);




            System.out.println("chcesz zakończyć? \nwciśnij y");
            exit = sc.nextLine();
        }

        System.out.println("Twoj wynik to: " );

    }

    public enum BronEnum{k, p, n

    }


}
