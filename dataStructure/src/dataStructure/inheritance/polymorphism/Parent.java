package dataStructure.inheritance.polymorphism;

public class Parent {
	
	protected String name;
	protected int age;
	
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	protected void hi() {
		System.out.println("안녕하십니까 올해로 "+age+"살인 "+name+"입니다.");
	}
}
