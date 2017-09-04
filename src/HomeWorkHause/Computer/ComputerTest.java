package HomeWorkHause.Computer;

import org.junit.Assert;
import org.junit.Test;


public class ComputerTest {
    Computer computer = new Computer("asus", "xd124", "asde", "plyta", 16.455f, true, true);
    @Test
    public void toStringTest(){

        Assert.assertEquals("computer[producer = Computer[producer = asus, model = xd124], processor = asde. mainBoard = plyta ram = 16.455, Windows 7, SSD mount", computer.toString());
    }
    @Test
    public void instalWindowsTest(){
        Assert.assertEquals("Windows 7", computer.hasOperatingSys());

    }
}
