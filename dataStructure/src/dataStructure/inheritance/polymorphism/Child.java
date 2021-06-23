package dataStructure.inheritance.polymorphism;

public class Child extends Parent{

	public Child(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void hi() {
		System.out.println("안녕? 내 이름은 "+name+"이고, "+age+"살이야! 만나서반가워~");
	}
}