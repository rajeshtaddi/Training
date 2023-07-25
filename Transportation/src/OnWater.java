
abstract public class OnWater extends WaterTransport {
        abstract void surfaceOfWater();
}
class Ship extends OnWater{
	public void move() {
		System.out.println("Ship is Moving");
	}
	void water() {
		System.out.println("Ship moving on Water");
	}
	void surfaceOfWater() {
		System.out.println("Ship is Moving On the Surface of Water");
	}
	void shipSpeed() {
		System.out.println("Ship is Moving On the Surface of Water with 150km/hour Speed");
	}
}
