package ENUM.ZAD4;



/**
 * Created by RENT on 2017-08-24.
 */
public class DayofTheWeek {
    public static void main(String[] args) {
        for(DayofTheWeek.DayofWeek dzienTygodnia : DayofTheWeek.DayofWeek.values()){
            System.out.printf("%s - %s - %s - %s\n", dzienTygodnia.polskienazwy, dzienTygodnia, dzienTygodnia.niemieckie, dzienTygodnia.next());
        }

    }

    enum DayofWeek{
        Mondey("Poniedzialek", "Montag") {DayofWeek next(){return Thrusday;}},
        Twusdey("Wtorek", "Dienstang"){DayofWeek next(){return Wendesday;}},
        Wendesday("Sroda", "Mittwoch"){DayofWeek next(){return Thrusday;}},
        Thrusday("Czwartek", "Donnerstag"){DayofWeek next(){return Friday;}},
        Friday("Piatek", "Freitag"){DayofWeek next(){return Saturday;}},
        Saturday("Sobota", "Samstag"){DayofWeek next(){return Sunday;}},
        Sunday("Niedziela", "Sonntag"){DayofWeek next(){return Mondey;}};

        abstract DayofWeek next();
        private final String polskienazwy, niemieckie;
        DayofWeek(String polskienazwy, String niemieckie) {
            this.polskienazwy = polskienazwy;
            this.niemieckie = niemieckie;

        }
    }
}