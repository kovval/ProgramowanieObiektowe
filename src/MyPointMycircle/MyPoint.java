package MyPointMycircle;

/**
 * Created by RENT on 2017-08-21.
 */
public class MyPoint {
    private int _x = 0;
    private int _y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        _x = x;
        _y = y;

    }

    public int getX() {
        return _x;
    }

    public void setX(int x) {
        _x = x;
    }

    public int getY() {
        return _y;
    }

    public void setY(int y) {
        _y = y;
    }

    public int[] getXY() {
        return new int[]{_x, _y};
    }

    public void setXY(int x, int y) {
        {_x = x; _y = y;}
    }
    public String toString(){
        return String.format("(%d, %d)",_x,_y);
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((x-_x),2)+Math.pow((y-_y),2));
    }
    public double distane(MyPoint another){
        return Math.sqrt(Math.pow((another.getX()-_x),2)+Math.pow((another.getY()-_y),2));
    }
    public double distance(){
        return Math.sqrt(Math.pow((_x),2)+Math.pow((_y),2));
    }
}




