package Circle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-18.
 */
public class CircleTest {
    @Test
    public void getRadius1() throws Exception {

    }

    @Test
    public void getCircumference1() throws Exception {

    }


    @Test
    public void CircleArea(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getCircumference(),0.01);
    }
    @Test
    public void CircleDefaultRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(),0.1);
    }
    @Test
    public void CircleAreaRadiusTwo(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.01);
    }
    @Test
    public void CircleAreaRadiusTwoForArea(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getCircumference(), 0.01);
    }
    @Test
    public void CircleAreaRadiusTwoStringForAreaTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("Circle [radius= 2.0color=red]", circle.toString());
    }
    @Test
    public void CircleColorsetColor(){
        Circle circle = new Circle( 1.0 ,"blue");
        Assert.assertEquals("blue", circle.getColor());
    }
    @Test
    public void CircleColorsetColorandArea(){
        Circle circleCon = new Circle(1.0 ,"blue");
        Assert.assertEquals(3.14, circleCon.getCircumference(), 0.01);
    }
}
