package dataStructure.abstractclass.figure;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//삼각형, 사각형, 원 객체 생성
		Triangle triangle = new Triangle(4,3);
		Square square = new Square(5,5);
		Circle circle = new Circle(10);
				
		// 관리에 사용될 리스트 생성 및 추가
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
