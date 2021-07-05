package dataStructure.abstractclass.figure;

public class Circle extends Figure{

	private int redius;
	
	public Circle(int redius) {
		this.redius = redius;
	}
	
	public String toString() {
		return "class : Circle , redius : "+redius; 
	}
	
	public double getArea() {
		//파이 값은 임의로 3.14로 가정한다.
		return redius * redius * 3.14;
	}
}
