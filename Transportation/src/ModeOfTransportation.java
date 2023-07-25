
public class ModeOfTransportation {

	public static void main(String[] args) {
		System.out.println("-----TRAIN------");
		Train trainobj=new Train();
		trainobj.move();
		trainobj.ground();
		trainobj.track();
		trainobj.trainSpeed();
		System.out.println("------METRO------");
		Metro metroObj=new Metro();
		metroObj.move();
		metroObj.ground();
		metroObj.track();
		metroObj.metroSpeed();
		System.out.println("------BIKE-------");
		Car carObj=new Car();
		carObj.move();
		carObj.ground();
		carObj.road();
		carObj.Gear();
		System.out.println("------CYCLE-------");
		Cycle cycleObj=new Cycle();
        cycleObj.move();
        cycleObj.ground();
        cycleObj.road();
        cycleObj.cycleSpeed();
        System.out.println("-------SUBMARINE--------");
        Submarine subObj=new Submarine();
        subObj.move();
        subObj.water();
        subObj.bottomOfWater();
        subObj.depth();
        System.out.println("-------SHIP----------");
        Ship shipObj=new Ship();
        shipObj.move();
        shipObj.water();
        shipObj.surfaceOfWater();
        shipObj.shipSpeed();
        System.out.println("--------PLANE-----------");
        Plane planeObj=new Plane();
        planeObj.move();
        planeObj.air();
        planeObj.top();
        planeObj.planeCapacity();
        System.out.println("-------HELICOPTOR---------");
        Helicoptor helObj=new Helicoptor();
        helObj.move();
        helObj.air();
        helObj.top();
        helObj.helicoptorCapacity();
        System.out.println("-------ROCKET------");
        Rocket rocketObj=new Rocket();
        rocketObj.move();
        rocketObj.air();
        rocketObj.space();
        rocketObj.rocketSpeed();
        
				
	

	}

}
interface Transportation{
	 void move();
}
abstract class LandTransport implements Transportation{
	 abstract void ground();
}
abstract class WaterTransport implements Transportation{
	abstract void water();
}
abstract class AirTransport implements Transportation{
	abstract void air();
}

