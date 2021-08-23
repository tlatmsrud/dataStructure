package dataStructure.immutableClass;

public class ImmutableStringBuilder {

	private final StringBuilder name; //*100
	
	ImmutableStringBuilder(StringBuilder name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name.toString();
	}
	
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("effective"); //*100
		ImmutableStringBuilder im = new ImmutableStringBuilder(name); //*100
		name.append("java"); //*100
		System.out.println(im); //*100
	}
}
