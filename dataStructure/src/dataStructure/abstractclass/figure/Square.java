package dataStructure.abstractclass.figure;

public class Square extends Figure{

	private int horizontal;
	private int vertical;
	
	public Square( int horizontal, int vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}
	
	public String toString() {
		return "class : Square , horizontal : "+horizontal + ", vertical : "+vertical; 
	}
	
	public double getArea() {
		return horizontal * vertical;
	}
}
