package Collections.Kolejki;

import java.time.Period;
import java.util.ArrayDeque;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-09-05.
 */
public class dequeueue {
    public static void main(String[] args) {



        ArrayDeque<Person> que = new ArrayDeque<>();
        que.add(new Person("mariola", "piwo, wino, cola"));
        que.add(new Person("jolka", "wagon szlugow"));
        que.add(new Person("Kuba", "Materac"));
        que.add(new Person("Mariola", "godność osobistą"));
        que.add(new Person("Merlin", ""));


        //Zacyznamy obsługę
       while(!que.isEmpty()) {

           Person currentClient = que.removeFirst();
           System.out.println(currentClient.getName() +"\n"+
           currentClient.unpackShopping());
       }



        ArrayDeque<String> kolejka = new ArrayDeque<String>();
        kolejka.add("Daria");
        kolejka.add("Stefania");
        kolejka.add("Syzyf");
        kolejka.add("Małgorzata");
        kolejka.add("Weronika");

//        int number = kolejka.size();
//        for(int i = 0; i < number; i++){
//            System.out.println(kolejka.remove());
//
//        }
//        for (Object s : kolejka) {
//            System.out.println(kolejka.offer("Daria"));
//
//        }

    }
}
