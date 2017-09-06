package Walizka;

/**
 * Created by RENT on 2017-09-06.
 */
public class Suitcase<T> {

        private T thing;

        public Suitcase() {
            this.thing = thing;
        }

        public void setPrzedmiot(T przedmiot){
            this.thing = przedmiot;
        }
        public T getPrzedmiot(){
            return thing;
        }

        public static void main(String[] args) {
            Suitcase number = new Suitcase();

            number.setPrzedmiot('K');
            System.out.println(number.getPrzedmiot());
            number.setPrzedmiot("KOKAINA");
            System.out.println(number.getPrzedmiot());
        }
    }

