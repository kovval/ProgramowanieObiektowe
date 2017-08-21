package MyPointMycircle;

/**
 * Created by RENT on 2017-08-21.
 */
public class MyCircle {
    private MyPoint _centre = new MyPoint(0,0);
    private int _radius = 1;

    public MyCircle(){}
    public MyCircle(int x, int y, int radius){
        _centre = new MyPoint(x, y);
        _radius = radius;
    }
    public MyCircle(MyPoint centre, int radius){
        _centre = centre;
        _radius = radius;

    }
}
