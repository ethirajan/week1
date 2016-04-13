package inheritance;

public class Car extends Vehicle{
	public static void main(String[] args) {
		Car carObj = new Car();
		carObj.applyBrakes();
		
		Vehicle vehicleObj = new Vehicle();
		vehicleObj.applyBrakes();
	}
}
