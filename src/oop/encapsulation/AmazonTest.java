package oop.encapsulation;

public class AmazonTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp=new LoginPage();
		
		lp.setUsername("admin@gmail.com");
		lp.setPassword("admin23");
		
		System.out.println(lp.getUsername());
		System.out.println(lp.getPassword());	
		
		lp.login(lp.getUsername(), lp.getPassword());
		
		//new user: 
		//private variable to public variable
		LoginPage lp1=new LoginPage();  
		lp1.login(lp1.getUsername(), lp1.getPassword()); //o/p is null bcz value is not set in lp1
	}
	
}
