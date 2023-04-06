package oop.abstraction;

public class LoginPage extends Page {
	
	public void title() {
		System.out.println("Lp--title");
	}
	
	public void url() {
		System.out.println("Lp--url");
	}
	
	public void doLogin(String un, String pwd ) {
		System.out.println(un+" "+pwd);
	}
	
	public void doLogin(String un, String pwd, int ph ) {
		System.out.println(un+" "+pwd+" "+ph);
	}

}
