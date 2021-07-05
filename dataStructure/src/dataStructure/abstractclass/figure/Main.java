package dataStructure.abstractclass.figure;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//�ﰢ��, �簢��, �� ��ü ����
		Triangle triangle = new Triangle(4,3);
		Square square = new Square(5,5);
		Circle circle = new Circle(10);
				
		// ������ ���� ����Ʈ ���� �� �߰�
		List<Figure> list = new ArrayList<Figure>();
				
		list.add(triangle);
		list.add(square);
		list.add(circle);
				
		Exhibition exhibition = new Exhibition();
		exhibition.setList(list);
		exhibition.showList();
		exhibition.getFigureArea();
	}
}
