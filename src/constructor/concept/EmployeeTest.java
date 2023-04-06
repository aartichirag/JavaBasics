package constructor.concept;

public class EmployeeTest {

	public static void main(String[] args) {
		
	//	Employee e1=new Employee(); //default
		Employee e2=new Employee("Tom");
		Employee e3=new Employee("Peter", 10);
		Employee e4=new Employee("Scott", 10, 20.55);
		Employee e5=new Employee("Ram", 10, 20.55, true);

	}

}
