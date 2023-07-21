
public class ClassExtensionTest {

	public static void main(String[] args) {
		
		 //Doctor x=new Doctor();
		 //x.diagnose();
		
		Surgeon x=new Surgeon();
		//Doctor x= new Surgeon();
		 x.diagnose();
		 x.cut();
		 x.stich();
		 x.pescribe();
		 x.charge();
		
		//HeartSurgeon x=new HeartSurgeon();
		//Doctor x=new HeartSurgeon();
		//Surgeon x=new HeartSurgeon();
		 //x.diagnose();
		
		
		/*if(x instanceof Doctor)
		{
			System.out.println("It's a Doctor's object");
		}
		else
		{
			System.out.println("It's not a Doctor's object");
		}
		System.out.println("-----------");
		if(x instanceof Surgeon)
		{
			System.out.println("It's a Surgeon's object");
		}
		else
		{
			System.out.println("It's not a Surgeon's object");
		}
		System.out.println("-----------");
		if(x instanceof HeartSurgeon)
		{
			System.out.println("It's a HeartSurgeon's object");
		}
		else
		{
			System.out.println("It's not a HeartSurgeon's object");
		}*/

	}

}
class Doctor{
	void diagnose() {
		System.out.println("Doctor is diagnosing...ENT Scan");
	}
	void charge()
	{
		System.out.println("Doctor will charge 500");
	}
	void pescribe()
	{
		System.out.println("Doctor will pescribe general medicine");
	}
	
}
class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon is diagnosing...CT Scan");
	}
	void charge()
	{
		System.out.println("Surgeon will charge 2000");
	}
	void pescribe()
	{
		System.out.println("Surgeon will pescribe expensive medicine");
	}
	void cut() {
		System.out.println("Surgeon can cut");
	}
	void stich() {
		System.out.println("Surgeon can stich");
	}
	
}
class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("HeartSurgeon is diagnosing...ECG Report");
	}
	void charge()
	{
		System.out.println("HeartSurgeon will charge 10000");
	}
	void pescribe()
	{
		System.out.println("Doctor will pescribe too expensive medicine");
	}
	
	
}