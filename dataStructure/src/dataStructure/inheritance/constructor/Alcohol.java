package dataStructure.inheritance.constructor;

public class Alcohol {

	protected double frequency;
	protected double price;
	protected String flavor;
	
	public Alcohol(double frequency, double price, String flavor) {
		this.frequency = frequency;
		this.price = price;
		this.flavor = flavor;
	}
	
	public String whatFlavor() {
		return "flavor is "+flavor;
	}
}
