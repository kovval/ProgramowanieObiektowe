package Powtorzenie.ZAD1;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by RENT on 2017-08-25.
 */
public class MyTimeTest {

    @Test
    public void testMyTimeKonstantinBargemen() {
        MyTime czas = new MyTime();
        Assert.assertEquals(0, czas.getHour());
        Assert.assertEquals(0, czas.getMinut());
        Assert.assertEquals(0, czas.getSecond());
    }

    @Test
    public void toStringformatprezentacjkidanych00() {
        MyTime czas = new MyTime();
        MyTime czas1 = new MyTime(1, 1, 1);
        Assert.assertEquals("00:00:00", czas.toString());
        Assert.assertEquals("01:01:01", czas1.toString());

    }

    @Test
    public void konstruktorzArgumentami() {
        MyTime czas = new MyTime(23, 23, 23);
        Assert.assertEquals(23, czas.getHour());
        Assert.assertEquals(23, czas.getMinut());
        Assert.assertEquals(23, czas.getSecond());
    }

    @Test
    public void sprawdzanieSetTime() {
        MyTime czas = new MyTime();
        czas.setTime(12, 12, 12);
        Assert.assertEquals(12, czas.getHour());
        Assert.assertEquals(12, czas.getMinut());
        Assert.assertEquals(12, czas.getSecond());
    }

    @Test
    public void sprawdzaniegetnextSecond() {
        MyTime czas = new MyTime();
        czas.setTime(23, 59, 59);
        czas.nextSecond();
        Assert.assertEquals(0, czas.getHour());
        Assert.assertEquals(0, czas.getMinut());
        Assert.assertEquals(0, czas.getSecond());
    }

    @Test
    public void sprawdzaniegetprevioussecend() {
        MyTime czas = new MyTime();
        czas.setTime(0, 0, 0);
        czas.previousSecond();
        Assert.assertEquals(23, czas.getHour());
        Assert.assertEquals(59, czas.getMinut());
        Assert.assertEquals(59, czas.getSecond());
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testhour60(){
        exception.expect(IllegalArgumentException.class);
        MyTime czas = new MyTime(60, 9, 9);

      
    }


    }









