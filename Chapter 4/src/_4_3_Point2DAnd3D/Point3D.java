package _4_3_Point2DAnd3D;
/*
 * 
 * @author DNABigBoss - hanunalya22@gmail.com
 * 
 */
public class Point3D extends Point2D {
	private float z;
	
	public Point3D(float x, float y) {
		super(x,y);
	}
	
	public Point3D() {
		super();
	}
	
	public float getZ() {
		return z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x, float y, float z) {
		super.setXY(x,y);
		this.z = z;
	}
	
	public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return super.toString() +
                ", z=" + z;
    }
}
