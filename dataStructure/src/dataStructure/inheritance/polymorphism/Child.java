package dataStructure.inheritance.polymorphism;

public class Child extends Parent{

	public Child(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void hi() {
		System.out.println("�ȳ�? �� �̸��� "+name+"�̰�, "+age+"���̾�! �������ݰ���~");
	}
}