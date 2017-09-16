package PiatekChalange.Kalendarz;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Rusia implements IWywolaj {
    @Override
    public void CalculateDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,
                new Locale("ru", "RU", "cyrl"));
        System.out.println(df.format(new Date()));
    }
}
