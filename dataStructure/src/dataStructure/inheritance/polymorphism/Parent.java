package dataStructure.inheritance.polymorphism;

public class Parent {
	
	protected String name;
	protected int age;
	
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	protected void hi() {
		System.out.println("�ȳ��Ͻʴϱ� ���ط� "+age+"���� "+name+"�Դϴ�.");
	}
}