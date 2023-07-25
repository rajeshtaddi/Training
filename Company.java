
public class Company {
	public static void main(String[] args) {
		EmployeeDetails empDetails1 = new EmployeeDetails();
		empDetails1.setEmployeeName("Rajesh");
		empDetails1.setAddress("AP,Vizag,535273");
		empDetails1.setJobRole("AssociateEngnier");
		empDetails1.setMobileNumber("7095915165");
		empDetails1.setSalary("20000");
		empDetails1.printEmployeeDetails();
		System.out.println("-----------------");
		Organization orgObj=new Organization();
		
		EmployeeIdCard idCard1=orgObj.getEmployeeIdCard(empDetails1);
		idCard1.printEmployeeIdCardDetails();
	}

}
class EmployeeDetails{
	private String employeeName;
	private String mobileNumber;
	private String jobRole;
	private String address;
	private String salary;
	/*public EmployeeDetails(String employeeName, String mobileNumber, String jobRole, String address, String salary) {
		super();
		this.employeeName = employeeName;
		this.mobileNumber = mobileNumber;
		this.jobRole = jobRole;
		this.address = address;
		this.salary = salary;
	}*/
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
		System.out.println("Employeee Name....:+"+employeeName);
		System.out.println("Job Role..........:+"+jobRole);
		System.out.println("Phone Number  ....:+"+mobileNumber);
		System.out.println("Salary............:"+salary);
		System.out.println("Adress....        :"+address);
	}
	
}
class EmployeeIdCard{
	private int employeeId;
	private String name;
	private String location;
	private String phoneNumber;
	private String role;
	/*public EmployeeIdCard(int employeeId, String name, String location, String phoneNumber,String role) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}*/
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
	void printEmployeeIdCardDetails() {
		System.out.println("--------ID CARD DETAILS-----------");
		System.out.println("EmployeeeId.......:+"+employeeId);
		System.out.println("Employee Name.....:+"+name);
		System.out.println("Location....  ....:+"+location);
		System.out.println("Job Role..........:"+role);
		System.out.println("PhoneNumber.......:"+phoneNumber);
	}
	
}
class Organization{
	EmployeeIdCard getEmployeeIdCard(EmployeeDetails empDetails) {
		System.out.println("Received Application from :"+empDetails.getEmployeeName());
		System.out.println("Creating Employee Id Card");
		EmployeeIdCard idObj=new EmployeeIdCard();
		double value=Math.random()*1000;
		int id=(int) value;
		idObj.setEmployeeId(id);
		idObj.setLocation("Pune");
		idObj.setName(empDetails.getEmployeeName());
		idObj.setRole(empDetails.getJobRole());
		idObj.setPhoneNumber(empDetails.getMobileNumber());
		return idObj;
	}
	
}