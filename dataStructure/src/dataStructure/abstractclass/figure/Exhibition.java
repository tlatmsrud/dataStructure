package dataStructure.abstractclass.figure;

import java.util.List;

public class Exhibition {

	private List<Figure> list;
	
	public void setList( List<Figure> list ) {
		this.list = list;
	}
	
	public void showList() {
		for(Figure figure : list) {
			System.out.println(figure.toString());
		}
	}
	
	public void getFigureArea() {
		for(Figure figure : list) {
			//컴파일 발생
			System.out.println(figure.getClass().getSimpleName()+ " : "+ figure.getArea());
		}
	}
}