
//1. instance member and method vs class member or method
//2. non static member  vs  static member
//3. object member vs class member
//4. object properties vs class properties

public class Employee {

	private int id;
	private String name;
	private double salary;
	private static String companyName ;
	private final double BONUS = 500;
	private static int idGenerator = 0;
	private static int objectCounter =0;
	
	static {
		companyName = "Seed Infotech";
	}

	public Employee() {
		 this("No Name", 1000);
	}

	public Employee( String name, double salary) {
		this.id =  ++idGenerator;
		this.name = name;
		this.salary = salary;
		++objectCounter;
	}

	public void display() {
		System.out.println("Id: " + this.id + "  name: " + name + "   salary:" + salary);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return this.id;
	}
	
	public void finalize() {
		System.out.println("full filled the last wish");
	}
	
	public double getBONUS() {
		return BONUS;
	}
	
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	public static String getCompanyName() {
		return companyName;
	}
	
	public static int getObjectCounter() {
		return objectCounter;
	}

}
