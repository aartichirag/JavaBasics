package basic.concepts;

public class EmployeeClassAndObject {
	
	String name;
	int age;
	String city;
	double salary;
	boolean isFullTime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeClassAndObject e1 = new EmployeeClassAndObject();
		e1.name="Tom";
		e1.age=35;
		e1.city="Toronto";
		e1.salary=12.55;
		e1.isFullTime=true;
		
		System.out.println(e1.name+ " "+ e1.age+" "+e1.city);
		
		EmployeeClassAndObject e2 = new EmployeeClassAndObject();
		e2.name="Scott";
		e2.age=40;
		e2.city="Brampton";
		e2.salary=20.55;
		e2.isFullTime=false;
		
		System.out.println(e2.name+ " "+e2.city+" "+ e2.salary+" "+e2.isFullTime);
	}

}
