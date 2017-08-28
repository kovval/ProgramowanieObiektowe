package Circle2;

import Circle.Circle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-18.
 */
public class Circle2Test {
    @Test
    public void testFirstCircle2(){
        Circle2 circle = new Circle2();
        Assert.assertEquals(1.0, circle.getRadius(), 0.1);
    }
    @Test
    public void testCircle2WithRadius2DotZero(){
        Circle2 circle = new Circle2(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }
    @Test
    public void testSetRadiusByRadius(){
        Circle2 circle = new Circle2();
        circle.setRadius(3.0);
        Assert.assertEquals(3.0, circle.getRadius(), 0.1);
    }
    @Test
    public void testWithOutSetRadius(){
        Circle2 circle = new Circle2();
        Assert.assertEquals(3.14, circle.getArea(), 0.01);
    }

    @Test
    public void testGetAreaBySetRadiusOn2Dot0(){
        Circle2 circle = new Circle2();
        circle.setRadius(3.0);
        Assert.assertEquals(28.26, circle.getArea(), 0.01);
    }
    @Test
    public void getCircumFeranceTestWithoutSetradius() {
        Circle2 circle = new Circle2(2);
        Assert.assertEquals(12.56, circle.getCircumference(), 0.01);
    }
    @Test
    public void getcircumFerenceWithSetRadius() {
        Circle2 circle = new Circle2();
        circle.setRadius(3.0);
        Assert.assertEquals(18.84, circle.getCircumference(), 0.01);
    }
    @Test
    public void getStringwithradius2dotZero() {
        Circle2 circle = new Circle2(2.0);
        Assert.assertEquals("Circle[radius= 2.0]", circle.toString());
    }
    @Test
    public void getColorCircle(){
        Circle2 circle = new Circle2(2.0, "blue");
        Assert.assertEquals("blue", circle.getColor());
    }


}
