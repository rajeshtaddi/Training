
abstract class Roads extends LandTransport{
	abstract void road();
}
class Car extends Roads{
	public void move() {
		System.out.println("Car is Moving");
	}
	void ground() {
		System.out.println("Car is Moving on Ground");
	}
	void road() {
		System.out.println("Car is Moving on Ground Roads");
	}
	void Gear() {
		System.out.println("Car is Moving on Road with 100 km/hour on 4th gear");
	}
	
}
class Cycle extends Roads{
	public void move() {
		System.out.println("Cycle is Moving");
	}
	void ground() {
		System.out.println("Cycle is Moving on Ground");
	}
	void road() {
		System.out.println("Cycle is Moving on Ground Roads");
	}
	void cycleSpeed() {
		System.out.println("Cycle is Moving on Road with 30 km/hour with no gears");
	}
	
}