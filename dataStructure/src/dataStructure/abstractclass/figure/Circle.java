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
		//���� ���� ���Ƿ� 3.14�� �����Ѵ�.
		return redius * redius * 3.14;
	}
}
