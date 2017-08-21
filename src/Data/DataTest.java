package Data;

import org.junit.Assert;
import org.junit.Test;

public class DataTest {

    @Test
    public void cheackDayinDataMonthandyear() {
        Data data = new Data(12, 12, 2007);
        Assert.assertEquals(12, data.getDay());
        Assert.assertEquals(12, data.getMonth());
        Assert.assertEquals(2007, data.getYear());
    }

    @Test
    public void checkSetDay() {
        Data data = new Data(12, 12, 2007);
        data.setDay(10);
        Assert.assertEquals(10, data.getDay());
    }

    @Test
    public void checkSetMonth() {
        Data data = new Data(12, 12, 2007);
        data.setMonth(10);
        Assert.assertEquals(10, data.getMonth());
    }

    @Test
    public void checkSetyearfrom12to2017() {
        Data data = new Data(12, 12, 2007);
        data.setYear(2017);
        Assert.assertEquals(2017, data.getYear());
    }
    @Test
    public void checkSetDatafullandtoStringtoOneSEvenTwoTousentSeventeen() {
        Data data = new Data(12, 12, 2007);
        data.setDate(1,1,2017);
        Assert.assertEquals("1/1/2017", data.toString());
    }


}
