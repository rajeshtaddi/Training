
abstract class Sky extends AirTransport {
    abstract void top();
}
class Plane extends Sky{
	public void move() {
		System.out.println("Plane is Moving");
	}
	void air() {
		System.out.println("Plane is Moving in air");
	}
	void top() {
		System.out.println("Plane is Moving in air at Top");
	}
	
	void planeCapacity() {
		System.out.println("Plane is Mocing in air with 150 people");
	}
}
class Helicoptor extends Sky{
	public void move() {
		System.out.println("Helicoptor is Moving");
	}
	void top() {
		System.out.println("Helicoptor is Moving in air at Top");
	}
	void air() {
		System.out.println("Helicoptor is Moving in air");
	}
	void helicoptorCapacity() {
		System.out.println("Helicoptor is Mocing in air with  people");
	}
}
