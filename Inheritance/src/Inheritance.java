
public class Inheritance {
	
	Point2D p2Dobj=new Point2D();
	
	

}
class Point2D
{
	private int x;
	private int y;
	
	Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println("The Value of x is :"+x);
		System.out.println("The Value of y is :"+y);
		
	}
}
class Point3D extends Point2D
{
	private int z;
	Point3D(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	void show()
	{
		super.show();
		System.out.println("The Value of z is :"+z);
	}
}
class ColourPoint3D extends Point3D
{
	private String colour;
	ColourPoint3D(int x,int y,int z,String colour)
	{
		super(x,y,z);
	}
	void show()
	{
		super.show();
		System.out.println("The Colour is :"+colour);
	}
}
