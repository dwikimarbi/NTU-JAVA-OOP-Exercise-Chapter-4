package _4_4_PointAndMovablePoint;
/*
 * 
 * @author DNABigBoss - hanunalya22@gmail.com
 * 
 */
public class Point {
	private float x;
	private float y;
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
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
