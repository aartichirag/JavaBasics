package basic.concepts;

public class Customers {
	
	String name;
	int id;
	String city = "Brampton";
	String payMethod ="cc";
	
	//method create
	public void getInfo() {
		System.out.println("get Info...");
	}
	
	public static void sendMail() {
		System.out.println("send mail...");
	}
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		
		Customers obj=new Customers();
		
			sendMail();
			Customers.sendMail(); //preferable way
			
			obj.sum(10, 20); //call by value
		

	}

}
