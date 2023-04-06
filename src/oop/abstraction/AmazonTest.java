package oop.abstraction;

public class AmazonTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.header();
		lp.logo();
		lp.doLogin("admin", "admin123", 12345);
		
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.logOut();
	
		//can't create obj of abstract class
		//Page p =new Page();
		
		//top casting
		Page p = new LoginPage();
		p.title();
		p.header();
		
	}

}
