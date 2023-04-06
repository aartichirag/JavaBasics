package constructor.concept;

public class UserTest {

	public static void main(String[] args) {
		
		User u1=new User("Tom");
		User u2=new User("Ali", 10);
		User u3=new User("Scott", 30, 25.55);
		User u4=new User("Ram", 20, 15.55, "Brampton");
		User u5=new User("Sam", 15, 20.55, "Tornto", true);
	}

}
