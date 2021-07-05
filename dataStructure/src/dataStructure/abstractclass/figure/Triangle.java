package dataStructure.abstractclass.figure;

public class Triangle extends Figure{

	private int base;
	private int height;
	
	public Triangle( int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public String toString() {
		return "class : Triangle , base : "+base + ", height : "+height; 
	}
	
	public double getArea() {
		return base * height * 0.5;
	}
}
