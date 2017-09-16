package PiatekChalange.Kalendarz;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Euro implements IWywolaj {
    @Override
    public void CalculateDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,
                new Locale("Pl", "PL", "PL"));
        System.out.println(df.format(new Date()));
    }
}
