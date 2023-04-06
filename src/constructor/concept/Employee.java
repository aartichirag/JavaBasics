package constructor.concept;

public class Employee {
	
	String name;
	int id;
	double salary;
	boolean isPerm;
	
	//name of constructor same as classname
	//constructor can not have any return type...not even void
	//Never create unnecessary main() in a class
	//Constructor will be called whenever you create an object of a class
	
	
	/*
	 * public Employee() { 
	 * System.out.println("default constructor"); 
	 * }
	 */
	
	public Employee(String name) {
		System.out.println(name);
	}

	public Employee(String name, int id) {
		System.out.println(name+" "+id);
	}
	
	public Employee(String name, int id, double salary) {
		System.out.println(name+" "+id+" "+salary);
	}
	
	public Employee(String name, int id,double salary, boolean isPerm) {
		System.out.println(name+" "+id+" "+salary+" "+isPerm);
	}


}
