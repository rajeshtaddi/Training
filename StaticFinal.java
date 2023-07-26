
public class StaticFinal {
	public static void main(String[] args) {
		
	ExampleClass.age=21;
	ExampleClass Obj=new ExampleClass("Rajesh");
	//Obj.showData();
	ExampleClass.showData();
	System.out.println("The Final DataMember :"+Obj.getData());
	
	
	//System.out.println("Static DataMemebr :"+Obj.age);
	}
}
class ExampleClass{
	static int age;
	final String name;
	ExampleClass(String name){
		this.name=name;
	}
	static void showData() {
		System.out.println("Static DataMember :"+age);
		//System.out.println("Final DataMember :"+name);
	}
	final String getData() {
		return name;
	}
	
}
