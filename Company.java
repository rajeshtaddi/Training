import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	public static void main(String[] args) {
		EmployeeDetails empDetails1 = new EmployeeDetails();
		empDetails1.setEmployeeName("Rajesh");
		empDetails1.setAddress("AP,Vizag,535273");
		empDetails1.setJobRole("AssociateEngnier");
		empDetails1.setMobileNumber("7095915165");
		empDetails1.setSalary("20000");
		//empDetails1.printEmployeeDetails();
		
		EmployeeDetails empDetails2 = new EmployeeDetails();
		empDetails2.setEmployeeName("Kunal");
		empDetails2.setAddress("Pune,Maharastra,522713");
		empDetails2.setJobRole("Research and Development");
		empDetails2.setMobileNumber("9492587138");
		empDetails2.setSalary("35000");
	    //empDetails2.printEmployeeDetails();

		EmployeeDetails empDetails3 = new EmployeeDetails();
		empDetails3.setEmployeeName("Pushpendra");
		empDetails3.setAddress("Raipur,Chattisgarh,521147");
		empDetails3.setJobRole("Research and Development");
		empDetails3.setMobileNumber("9754862178");
		empDetails3.setSalary("25000");
	    //empDetails3.printEmployeeDetails();
		
		Organization orgObj=new Organization();
		
		EmployeeIdCard idCard1=orgObj.getEmployeeIdCard(empDetails1);
		EmployeeIdCard idCard2=orgObj.getEmployeeIdCard(empDetails2);
		EmployeeIdCard idCard3=orgObj.getEmployeeIdCard(empDetails3);
		
		ArrayList<EmployeeIdCard> employeeList = new ArrayList<EmployeeIdCard>();
		employeeList.add(idCard1);
		employeeList.add(idCard2);
		employeeList.add(idCard3);
		
		//idCard1.printEmployeeIdCardDetails();
		//idCard2.printEmployeeIdCardDetails();
		//idCard3.printEmployeeIdCardDetails();
		Iterator<EmployeeIdCard> empIterator = employeeList.iterator();
		
		System.out.println("--------PRINTING ID CARD DETAILS BY MULTITHREADING-----------");
		while(empIterator.hasNext()) {
			EmployeeIdCard x = (EmployeeIdCard) empIterator.next();
			x.start();
		}
		//Storing the idCard objects data in file using Serialization
		  try 
		  {
			  FileOutputStream fout = new FileOutputStream("employee.txt");
				//System.out.println("File is ready...");
				
				ObjectOutputStream oos = new ObjectOutputStream(fout);
				//System.out.println("Object output stream is ready....");
				
				ArrayList<EmployeeIdCard> empList = new ArrayList<EmployeeIdCard>();
				
				empList.add(idCard1);
				empList.add(idCard2);
				empList.add(idCard3);
				
				
				oos.writeObject(empList); //STORE THE ARRAY LIST
				
				//System.out.println("Objects ARE serialized.....");
				
				oos.close();
				fout.close();
		        //System.out.println("Streams are closed....");
		  } catch (IOException e) {
				   e.printStackTrace();
				  }
		  
		  //JDBC created table name EMPLOYE120 for idCard Details Storin
		  
			try {
				//1. Load the Driver
				//System.out.println("Trying to load the driver...");
					DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
				//System.out.println("Driver loaded....");
				
				//2. Acquire the connection
				//System.out.println("Trying to connect....");
				Connection conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				//System.out.println("Connected : "+ conn);
				
				//3. make a desired statement (insert/update/delete/select)
				
				PreparedStatement pst = 
						conn.prepareStatement("INSERT INTO EMPLOYE120 VALUES (?,?,?,?)");
				
				pst.setString(1,"RAJESH");
				pst.setString(3, "VIZAG");
				pst.setString(2,"7095915165");
				pst.setString(4,"Engnieer");
				
				
				//System.out.println("PreparedStatement is created : "+ pst);
				
				//4. execute that statement //  UR TABLENAME IS MYDEPT120
				int rows = pst.executeUpdate();
				
				//System.out.println("Rows created : "+rows);
				
				//6. close the statement, and connection
				
				pst.close();
				conn.close();
				//System.out.println("Disconnected from the database....");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
}
class EmployeeDetails{
	private String employeeName;
	private String mobileNumber;
	private String jobRole;
	private String address;
	private String salary;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	void printEmployeeDetails() {
		System.out.println("--------EMPLOYEE DETAILS-----------");
		System.out.println("Employeee Name....:"+employeeName);
		System.out.println("Job Role..........:"+jobRole);
		System.out.println("Phone Number  ....:"+mobileNumber);
		System.out.println("Salary............:"+salary);
		System.out.println("Adress....        :"+address);
	}
}
class EmployeeIdCard extends Thread implements Serializable{
	private int employeeId;
	private String name;
	private String location;
	private String phoneNumber;
	private String role;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getNameOfEmployee() {
		return name;
	}
	public void setNameOfEmployee(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "EmployeeIdCard [employeeId=" + employeeId + ", name=" + name + ", location=" + location
				+ ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
	}
	void printEmployeeIdCardDetails() {
		
		System.out.println("EmployeeeId of....:"+name+" is "+employeeId);
		//System.out.println("Employee Name.....:"+name);
		System.out.println("Location of.......:"+name+" is "+location);
		System.out.println("Job Role of.......:"+name+" is "+role);
		System.out.println("PhoneNumber of....:"+name+" is "+phoneNumber);
	}
	public void run() { 
		for(int i=1;i<6;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		printEmployeeIdCardDetails();
	}
	
}
class Organization{
	EmployeeIdCard getEmployeeIdCard(EmployeeDetails empDetails) {
		System.out.println("Received Application from :"+empDetails.getEmployeeName()+" Creating Employee Id Card");
		//System.out.println("Creating Employee Id Card of :"+empDetails.getEmployeeName());
		EmployeeIdCard idObj=new EmployeeIdCard();
		double value=Math.random()*1000;
		int id=(int) value;
		idObj.setEmployeeId(id);
		idObj.setLocation("Pune");
		idObj.setNameOfEmployee(empDetails.getEmployeeName());
		idObj.setRole(empDetails.getJobRole());
		idObj.setPhoneNumber(empDetails.getMobileNumber());
		return idObj;
	}
	
}
