package dataStructure.inheritance.constructor;

public class Rum extends Alcohol{

	private String rumType;

	public Rum(String rumType, double frequency, double price, String flavor) {
		super(frequency, price, flavor);
		this.rumType = rumType;
	}
	
	public static void main(String[] args) {
		Rum rum = new Rum("DarkRum", 40.0, 69000, "bitter");
		System.out.println(rum.whatFlavor());
	}
}
