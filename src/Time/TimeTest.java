package Time;

import org.junit.Assert;
import org.junit.Test;

public class TimeTest {
    @Test
    public void checkTimeforOneOneOne() {
        Time time = new Time(1, 1, 1);
        Assert.assertEquals(1, time.getHour());
        Assert.assertEquals(1, time.getMinute());
        Assert.assertEquals(1, time.getSecond());
    }

    @Test
    public void checksetMinutForchangeitTo2() {
        Time time = new Time(1, 1, 1);
        time.setMinute(2);
        Assert.assertEquals(2, time.getMinute());
    }

    @Test
    public void checksetSecondForchangeitTo2() {
        Time time = new Time(1, 1, 1);
        time.setSecond(2);
        Assert.assertEquals(2, time.getSecond());
    }

    @Test
    public void checksethourForchangeitTo2() {
        Time time = new Time(1, 1, 1);
        time.setHour(2);
        Assert.assertEquals(2, time.getHour());
    }

    @Test
    public void checktoStringForTimeOneTwoThree() {
        Time time = new Time(1, 2, 3);
        Assert.assertEquals("1:2:3", time.toString());
    }
    @Test
    public void nextSecondfrom1to2Check() {
        Time time = new Time(1, 2, 3);
        Assert.assertEquals(4, time.nextSeccond() );
    }
    @Test
    public void previousSecconffrom3to2() {
        Time time = new Time(1, 2, 3);
        Assert.assertEquals(2, time.previousSeccond() );
    }

}
