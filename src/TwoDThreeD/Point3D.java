package TwoDThreeD;

/**
 * Created by RENT on 2017-08-22.
 */
public class Point3D extends Point2D {
    private float _z = 0.0f;


    public Point3D(float x, float y, float z) {
        super(x, y);
        _z = z;
    }

    public float getZ() {
        return _z;
    }

    public void setZ(float z) {
        _z = z;
    }

    public void setXYZ(float x, float y, float z) {

        setX(x);
        setY(y);
        _z = z;

    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), _z};
    }

    public String toString(){
        return String.format("%f, f, %f", getX(), getY(), getZ());
    }

}


