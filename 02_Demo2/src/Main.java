
public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(10, "jack", 5000);
		Employee emp2 = new Employee(11, "jackie", 8000);
		
		Employee.setCompanyName("Persistent");
		System.out.println(Employee.getCompanyName());

		
	}
	
	public void foo() {
		
	}
	
	public static void sample1() {
		Employee emp1 = new Employee(10, "jack", 5000);
		emp1.display();

		Employee emp2 = new Employee(11, "jackie", 8000);
		emp2.display();

		Employee emp3 = new Employee();
		emp3.setId(12);
		emp3.setName("Jessica");
		emp3.setSalary(4000);
		emp3.display();

		emp1 = emp2;
		emp3 = emp1;
		
		
		System.out.println("---------------------");
		System.gc();
		Runtime.getRuntime().gc();
		
		emp1.display();
		emp2.display();
		emp3.display();
	}

}
