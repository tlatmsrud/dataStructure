package dataStructure.inheritance.constructor;

public class ChildClass extends ParentClass{

	public ChildClass() {
		System.out.println("ChildClass constructor call");
	}
	
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
	}
}
