package _4_1_TheCircleAndCylinderClasses;
/*
 * 
 * @author DNABigBoss
 * 
 */
public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        this(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
    	this.height = height;
    }
    
    public double getVolume() {
        return super.getArea()*height;
    }

    public double getArea() {
        return 2*Math.PI*getRadius()*height + 2* super.getArea();
    }
    
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
             + " height=" + height;
    }
}
