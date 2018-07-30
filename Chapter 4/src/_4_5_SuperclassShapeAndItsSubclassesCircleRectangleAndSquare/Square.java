package _4_5_SuperclassShapeAndItsSubclassesCircleRectangleAndSquare;
/*
 * 
 * @author DNABigBoss - hanunalya22@gmail.com
 * 
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return String.format("A Square with side = %f , which is a subclass of %s"
                            , super.toString());
    }
}