package inheritanceTest;

public class Motorbike extends Bike{
	private String color;
	
	public Motorbike(int numWheels, String bikeType, String color) {
		super(numWheels, bikeType);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
