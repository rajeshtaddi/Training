
abstract class Space extends AirTransport{
	abstract void space();

}
class Rocket extends Space{
	public void move() {
		System.out.println("Rocket is Moving");
	}
	void air() {
		System.out.println("Rocket can Move in air");
	}
	void space() {
		System.out.println("Rocket is Moving in Space after moving in Air");
	}
	
	void rocketSpeed() {
		System.out.println("Rocket is Moving in Space with 1000km/hour");
	}
}