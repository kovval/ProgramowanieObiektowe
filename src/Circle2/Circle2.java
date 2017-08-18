package Circle2;

import java.awt.geom.Area;

/**
 * Created by RENT on 2017-08-18.
 */
public class Circle2 {
    private double _radius = 1.0;
    public Circle2(){}
    public Circle2(double r){
        _radius = r;
    }
    public double getRadius(){
        return _radius;
    }
    public void setRadius(double radius){
        _radius = radius;

    }
    public double getArea(){
        return 3.14*Math.pow(_radius, 2d);
    }
    public double getCircumference(){
        return 2*3.14*_radius;
    }
    public String toString(){
        return "Circle[radius= "+ _radius +"]";
    }
}
