package _4_5_SuperclassShapeAndItsSubclassesCircleRectangleAndSquare;
/*
 * 
 * @author DNABigBoss
 * 
 */
public class Circle extends Shape {
	private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius = %f, which is a subclass of %s"
                            , radius, super.toString());
    }
}
