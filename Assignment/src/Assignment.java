
 public class Assignment{
		public static void main(String[] args) {
			
			Phone phoneobj1 = new Phone();
			phoneobj1.setName(19000,"NordC3","OnePlus","Green");
			phoneobj1.getName();
			
			phoneobj1.changeColour("Yellow");//calling function without returntype and with argument
			phoneobj1.getName();
			
			Phone phoneobj2= new Phone();
			phoneobj2.setName(8000,"C1","Realme","Black");
			phoneobj2.getName();
			
			int amount=phoneobj2.totalPrice(5); //calling function with returntype and with argument
			System.out.println("The total amount is :"+amount);
			
			
			Phone phoneobj3=new Phone(17000,"X2","Poco","Blue"); //initializing using parameterized constructor
			phoneobj3.getName();
			
			String model=phoneobj3.getModelName(); //calling function with returntype and without argument
			System.out.println("The ModelName of the phone is "+model);
			
			System.out.println("-------------");
			
			//overloading
			phoneobj1.phoneType();
			phoneobj2.phoneType(9000);
			phoneobj3.phoneType("C3");
			phoneobj1.phoneType(19000,"OnePlus");
			
		}
	}

class Phone {
   private int price;
   private String modelname;
   private String brand;
   private String colour;
   
   Phone() //default constructor 
   {
	   System.out.println("Constructor was called ");
   }
   Phone(int price,String modelname,String brand,String colour) //parameterized constructor
   {
	   this.price=price;
	   this.modelname=modelname;
	   this.brand=brand;
	   this.colour=colour;
	   
   }
   
   public void setName(int price,String modelname,String brand,String colour) //without returntype and with arguments
   {
	   this.price=price;
	   this.modelname=modelname;
	   this.brand=brand;
	   this.colour=colour;
   }
   public void getName() //without returntype and without argument
   {
	   System.out.println(" ");
	   System.out.println("The Price of the Phone : " + price);
	   System.out.println("The Name of the Model :"+ modelname);
	   System.out.println("The Brand is :"+ brand);
	   System.out.println("The Colour of the phone is :" + colour);
	   System.out.println(" ");
   }
   public void changeColour(String newColour) // without returntype and with argument
   {
	   System.out.println("Changing the colour of phone");
	   colour=newColour;
	   
   }
   int totalPrice(int noOfPhones) //with returntype and with argument
   {
	   return price*noOfPhones;
   }
   String getModelName() //with returntype and without argument
   {
	   return modelname;
   }
   //overloading
   
   void phoneType()
   {
	 System.out.println("Enter the Phone Price and Model");   
   }
   void phoneType(int x,String modelType)
   {
	   System.out.println("The Phone is of Cost :"+x+"  The Model is "+modelType);
   }
   void phoneType(int x)
   {
	   System.out.println("The phone cost is :"+x);
   }
   void phoneType(String modelType)
   {
	   System.out.println("The Phone Model is :"+modelType);
   }
}

