package dataStructure.generic;

public class Main {

	public static void main(String[] args) {

		Box<Integer> box = new Box<Integer>();
		box.set(10);
		
		//Integer i = box.get(); // 컴파일 에러
		Integer i = box.get();
		System.out.println(i);
	}
}
