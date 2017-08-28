package Circle2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-22.
 */
public class CelinderTest {
    @Test
    public void NoArgumentKonstruktorCylinder(){
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(1, cylinder.getRadius(),0.1);
        Assert.assertEquals(1, cylinder.getHeight(),0.1);
        Assert.assertEquals(3.14, cylinder.getArea(),0.1);
        Assert.assertEquals(3.14, cylinder.getVolume(), 0.1);
        Assert.assertEquals("red", cylinder.getColor());

    }
    @Test
    public void dRugikonstruktor(){
        Cylinder cylinder = new Cylinder(1, 1, "blue" );
        Assert.assertEquals(1, cylinder.getRadius(),0.1);
        Assert.assertEquals(1, cylinder.getHeight(),0.1);
        Assert.assertEquals(3.14, cylinder.getArea(),0.1);
        Assert.assertEquals(3.14, cylinder.getVolume(), 0.1);
        Assert.assertEquals("blue", cylinder.getColor());

    }
    @Test
    public void CylinderConstructorradius(){
        Cylinder cylinder = new Cylinder(2);
        Assert.assertEquals(2, cylinder.getRadius(),0.1);
        Assert.assertEquals(1, cylinder.getHeight(),0.1);
        Assert.assertEquals(12.56, cylinder.getArea(),0.1);
        Assert.assertEquals(12.56, cylinder.getVolume(), 0.1);
        Assert.assertEquals("red", cylinder.getColor());

    }
    @Test
    public void CylinderConstructorradiusGetHight(){
        Cylinder cylinder = new Cylinder(2, 2);
        Assert.assertEquals(2, cylinder.getRadius(),0.1);
        Assert.assertEquals(2, cylinder.getHeight(),0.1);
        Assert.assertEquals(12.56, cylinder.getArea(),0.1);
        Assert.assertEquals(25.12, cylinder.getVolume(), 0.1);
        Assert.assertEquals("red", cylinder.getColor());

    }



}
