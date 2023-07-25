
abstract class Railways extends LandTransport {
   abstract void track();
}
class Train extends Railways{
	public void move() {
		System.out.println("Train is Moving");
	}
	void ground() {
		System.out.println("Train is Moving on Ground");
	}
	void track() {
		System.out.println("Train is Moving on Ground Track");
	}
	void trainSpeed() {
		System.out.println("Train is Moving is 300 km/hour");
	}
}
class Metro extends Railways{
	public void move() {
		System.out.println("Metro is Moving");
	}
	void ground() {
		System.out.println("Metro is Moving on Ground");
	}
	void track() {
		System.out.println("Metro is Moving on Ground Track");
	}
	void metroSpeed() {
		System.out.println("Metro is Moving is 70 km/hour");
	}
}

