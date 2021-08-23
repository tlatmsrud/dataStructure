package dataStructure.immutableClass;

public class ImmutableStr {

	private String str; //*100
	
	public ImmutableStr(String str) {
		this.str = str;
	}
	
	public String toString() {
		return str;
	}
	public static void main(String[] args) {
		String str = "effective"; //*100
		
		ImmutableStr im = new ImmutableStr(str);
		str = str.concat("java"); //*200
		System.out.println(str); //*200
		System.out.println(im); //*100
		
	}
}
