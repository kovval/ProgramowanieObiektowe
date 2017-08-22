package movablePoint;

/**
 * Created by RENT on 2017-08-22.
 */
public class MovablePoint extends Point {
    private float _xSpeed = 0.0f;
    private float _ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;

    }
    public MovablePoint() {}

    public float getXSpeed() {
        return _xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        _xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return _ySpeed;
    }

    public void setYSpeed(float ySpeed) {
       _ySpeed = ySpeed;
    }




}
