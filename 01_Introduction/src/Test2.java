
public class Test2 {
	public static void main(String[] args) {
		int a;
		MyDate ob1;  //ob1 is reference of MyDate
		ob1 = new MyDate();

		ob1.dd = 10;
		ob1.mm = 3;
		ob1.yy = 2022;
		
		ob1.display();
		//System.out.println(ob1.dd+"/"+ob1.mm+"/"+ob1.yy);
		
		
		MyDate ob2=new MyDate();
		ob2.display();
		//System.out.println(ob2.dd+"/"+ob2.mm+"/"+ob2.yy);
		
		Employee e = new Employee();
		e.display();
		
	}
}
