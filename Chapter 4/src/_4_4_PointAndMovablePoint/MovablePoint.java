package _4_4_PointAndMovablePoint;
/*
 * 
 * @author DNABigBoss - hanunalya22@gmail.com
 * 
 */
public class MovablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MovablePoint(float x, float xSpeed, float y, float ySpeed) {
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    @Override
    public String toString() {
        return super.toString()
                + "X-Speed = " + getxSpeed()
                + "Y-Speed = " + getySpeed();
    }

    public MovablePoint move() {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}