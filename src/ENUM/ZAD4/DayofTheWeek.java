package ENUM.ZAD4;



/**
 * Created by RENT on 2017-08-24.
 */
public class DayofTheWeek {
    public static void main(String[] args) {
        for(DayofTheWeek.DayofWeek dzienTygodnia : DayofTheWeek.DayofWeek.values()){
            System.out.printf("%s - %s - %s \n", dzienTygodnia.polskienazwy, dzienTygodnia, dzienTygodnia.niemieckie);
        }

    }

    enum DayofWeek{
        Mondey("Poniedzialek", "Montag"),
        Twusdey("Wtorek", "Dienstang"),
        Wendesday("Sroda", "Mittwoch"),
        Thrusday("Czwartek", "Donnerstag"),
        Friday("Piatek", "Freitag"),
        Saturday("Sobota", "Samstag"),
        Sunday("Niedziela", "Sonntag"),;

        private final String polskienazwy, niemieckie;
        DayofWeek(String polskienazwy, String niemieckie) {
            this.polskienazwy = polskienazwy;
            this.niemieckie = niemieckie;
        }
    }
}