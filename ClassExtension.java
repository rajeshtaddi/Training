
public class ClassExtension {

	public static void main(String[] args) {
		Doctor obj1=new Doctor();
		obj1.diagnose();
		obj1.perscribe();
		obj1.charge();
		System.out.println("------------");
		Surgeon obj2=new Surgeon();
		obj2.diagnose();
		obj2.perscribe();
		obj2.charge();
		obj2.cut();
		obj2.stich();
		System.out.println("-------------");
		Doctor obj3=new Surgeon();
		obj3.diagnose();
		obj3.perscribe();
		obj3.charge();
		//obj3.cut();
		//obj3.stich();
		System.out.println("--------------");
		HeartSurgeon obj4=new HeartSurgeon();
		obj4.diagnose();
		obj4.perscribe();
		obj4.charge();
		obj4.operation();
		obj4.cut();
		obj4.stich();
		System.out.println("--------------");
		Doctor obj5=new HeartSurgeon();
		obj5.diagnose();
		obj5.perscribe();
		obj5.charge();
		System.out.println("---------------");
		Surgeon obj6=new HeartSurgeon();
		obj6.diagnose();
		obj6.perscribe();
		obj6.charge();
		obj6.cut();
		obj6.stich();

	}

}
class Doctor{
	void diagnose() {
		System.out.println("Doctor is diagnosing ");
	}
	void perscribe() {
		System.out.println("Doctor perscribe low cost medicine");
	}
	void charge() {
		System.out.println("Doctor will charge 500");
	}
}
class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon is diagnosing");
	}
	void perscribe() {
		System.out.println("Surgeon perscribe high cost medicine");
	}
	void charge() {
		System.out.println("Surgeon will charge 1000");
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
		System.out.println("HeartSurgeon is diagnosing");
	}
	void perscribe() {
		System.out.println("HeartSurgeon perscribe too high cost medicine");
	}
	void charge() {
		System.out.println("HeartSurgeon will charge 50000");
	}
	void operation() {
		System.out.println("HeartSurgeon can do operation");
	}
}
