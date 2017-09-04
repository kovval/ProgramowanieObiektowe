package HomeWorkHause.Hause;

import org.junit.Assert;
import org.junit.Test;

public class HauseTest {
    @Test
    public void constructroTestForStreetCityPostalCodeToString() {
        Hause hause = new Hause("five", "Wrocław", "Grabiszyńska", "52-534");
        Assert.assertEquals("five", hause.getNumber());
        Assert.assertEquals("Wrocław", hause.getStreet());
        Assert.assertEquals("city = Grabiszyńska, postalCode = 52-534", hause.getCityAndPostalCode());
        Assert.assertEquals("Hause[street = Wrocław, number = five, city = Grabiszyńska, postalCode = 52-534, floor = 1", hause.toString());
    }
    @Test
    public void constructroTestForStreetCityPostalCodeFloor9() {
        Hause hause = new Hause("five", "Wrocław", "Grabiszyńska", "52-534", 9);
        Assert.assertEquals("five", hause.getNumber());
        Assert.assertEquals("Wrocław", hause.getStreet());
        Assert.assertEquals("city = Grabiszyńska, postalCode = 52-534", hause.getCityAndPostalCode());
        Assert.assertEquals(9, hause.getFloors());
        Assert.assertEquals("Hause[street = Wrocław, number = five, city = Grabiszyńska, postalCode = 52-534, floor = 9", hause.toString());
    }
    @Test
    public void setNumberTwelfe(){
        Hause hause = new Hause("five", "Wrocław", "Grabiszyńska", "52-534", 9);
        hause.setNumber("Twelfe");
        Assert.assertEquals("Twelfe", hause.getNumber());
    }
    @Test
    public void setNStreet(){
        Hause hause = new Hause("five", "Wrocław", "Grabiszyńska", "52-534", 9);
        hause.setStreet("Zielińskiego");
        Assert.assertEquals("Zielińskiego", hause.getStreet());
    }
    @Test
    public void setPostalCodeAndCity(){
        Hause hause = new Hause("five", "Wrocław", "Grabiszyńska", "52-534", 9);
        hause.setCityAndPostalCode("Warszawa", "96-100");
        Assert.assertEquals("city = Warszawa, postalCode = 96-100", hause.getCityAndPostalCode());
    }
    @Test
    public void setfloor(){
        Hause hause = new Hause("five", "Wrocław", "Grabiszyńska", "52-534", 9);
        hause.setFloors(12);
        Assert.assertEquals(12, hause.getFloors());
    }


}
