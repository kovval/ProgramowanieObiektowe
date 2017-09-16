package PiatekChalange.Kalendarz;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class China implements IWywolaj {
    @Override
    public void CalculateDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,
                new Locale("ch", "CH", "CH"));
        System.out.println(df.format(new Date()));
    }
}
