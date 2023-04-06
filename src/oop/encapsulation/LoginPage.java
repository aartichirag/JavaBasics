package oop.encapsulation;

public class LoginPage {
	
	private String username;
	private String Password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public void login(String username, String password) {
		System.out.println(username+" "+password);
	}
	

}
