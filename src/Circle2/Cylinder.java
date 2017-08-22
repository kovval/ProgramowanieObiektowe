package Circle2;

/**
 * Created by RENT on 2017-08-22.
 */
public class Cylinder extends Circle2 {
    private double _height = 1.0;

    public Cylinder(){
        super();
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        _height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        _height = height;
    }

    public double getHeight(){
        return _height;
    }
    public void setRadius(double height){
        _height = height;
    }
    public double getVolume(){
        return getArea()*_height;
    }
}
