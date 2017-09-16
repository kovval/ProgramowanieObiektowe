package PiatekChalange.Kalendarz;

import java.time.LocalDate;

public class Kalendarz {

    IWywolaj wywolaj;

    public void setWywolaj(IWywolaj wywolaj) {
        this.wywolaj = wywolaj;
    }

    public Kalendarz(IWywolaj wywolaj) {
        this.wywolaj = wywolaj;
    }

        public void drukujDzisiaj(){
            LocalDate localDate = LocalDate.now();
            wywolaj.CalculateDate();
    }
    public void setKalendarz(IWywolaj wywolaj){
            this.wywolaj = wywolaj;

    }

}
