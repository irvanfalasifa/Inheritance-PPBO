package inheritanceTest;

public class InheritanceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Toyota = new Car(4,5,false);
		Convertible Nissan = new Convertible(4,2,true,"Convertible");
		Bike Suzuki = new Bike(2, "Manual");
		Motorbike Vario = new Motorbike(2,"Automatic","Red");
		System.out.println(
				"Number of Doors on Toyota's Car :"+
				Toyota.getNumDoors());
		System.out.println(
				"Number of Wheels on Toyota's Car :"+
				Toyota.getWheels());
		String electric;
		electric = Toyota.getIsElectric() ? "yes":"no";
		System.out.println("is the Toyota's Car electric ? "+electric);
		System.out.println();
		System.out.println(
				"Number of Doors on Nissan's Car :"+
				Nissan.getNumDoors());
		System.out.println(
				"Number of Wheels on Nissan's Car :"+
				Toyota.getWheels());
		electric = Nissan.getIsElectric() ? "yes":"no";
		System.out.println("is the Nissan's Car electric ? "+electric);
		System.out.println(
				"Roof Type of Nissan's Car : " +
				Nissan.getRoofType());
		System.out.println();
		System.out.println(
				"Number of Wheels on Suzuki's Bike : " +
				Suzuki.getWheels());
		System.out.println(
				"Type of Suzuki's Bike : " +
				Suzuki.getBikeType());
		System.out.println();
		System.out.println(
				"Number of Wheels on Vario's Motorbike : " +
				Vario.getWheels());
		System.out.println(
				"Type of Vario's Motorbike : " +
				Vario.getBikeType());
		System.out.println(
				"Color of Vario's Motorbike : " +
				Vario.getColor());
	}

}
