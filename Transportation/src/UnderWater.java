
abstract class UnderWater extends WaterTransport{
   abstract void bottomOfWater();
}
class Submarine extends UnderWater{
	public void move() {
		System.out.println("Submarine is Moving");
	}
	void water() {
		System.out.println("Submarine moving in Water");
	}
	void bottomOfWater() {
		System.out.println("Submarine is Moving Under the Water");
	}
	void depth() {
		System.out.println("Submarine is Moving 700m depth Under the Water");
	}
}
