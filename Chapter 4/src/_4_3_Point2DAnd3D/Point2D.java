package _4_3_Point2DAnd3D;
/*
 * 
 * @author DNABigBoss
 * 
 */
public class Point2D {
	private float x;
	private float y;
	
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D() {
		x = 0.0f;
		y = 0.0f;
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float[] getXY(){
		float x = 0;
		float y = 0;
	    return new float[] {x, y};
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}
