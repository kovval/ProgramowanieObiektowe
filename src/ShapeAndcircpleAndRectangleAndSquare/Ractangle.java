package ShapeAndcircpleAndRectangleAndSquare;

/**
 * Created by RENT on 2017-08-22.
 */
public class Ractangle extends Shape {
    private double _width = 1.0;
    private double _length = 1.0;

    public Ractangle(){}
    public Ractangle(double width, double length){
        _width = width;
        _length = length;
    }
    public Ractangle(double width, double length, String color, boolean filled){
        super(color, filled);
        _width = width;
        _length = length;
    }
    public double getWidth() { return _width;}
    public void setWidth(double width){ _width = width;}
    public double getLength(){return _length;}
    public void setLength(double length){_length = length;}

    public double getArea() {return _length*_width;}

    public double getPermimeter() { return 2*_length+2*_width;}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A ractangle with width= ")
                .append(_width)
                .append(" and length= ")
                .append(_length)
                .append(" wich is a subclass of ")
                .append(super.toString());

        return sb.toString();
    }



}
