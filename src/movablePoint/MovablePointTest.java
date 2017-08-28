package movablePoint;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class MovablePointTest {
    @Test
    public void moveblepointToString(){
        MovablePoint move = new MovablePoint(12, 12,12,12);
        Assert.assertEquals("(12,000000, 12,000000), speed = (12,000000, 12,000000)" , move.toString());
    }
    @Test
    public void movegetSpeed(){
        MovablePoint move = new MovablePoint(12, 12,12,12);
        float[] expectedoutpood = {12, 12};
        Assert.assertArrayEquals(new float[][]{expectedoutpood}, new float[][]{move.getSpeed()});

    }
}
