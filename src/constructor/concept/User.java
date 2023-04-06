package constructor.concept;

public class User {
	String name;
	int id;
	double salary;
	String city;
	boolean isperment;
	
	public User(String name) {
		System.out.println(name);
	}
	
	public User(String name, int id) {
		System.out.println(name+" "+id);
	}
	
	public User(String name, int id, double salary) {
		System.out.println(name+" "+id+" "+salary);
	}
	
	public User(String name, int id, double salary, String city) {
		System.out.println(name+" "+id+" "+salary+" "+city);
	}
	
	public User(String name, int id, double salary, String city, boolean isperment) {
		System.out.println(name+" "+id+" "+salary+" "+city+" "+isperment);
	}
	
	

}
