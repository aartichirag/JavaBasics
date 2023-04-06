package oop.abstraction;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("HP--title");	
	}
	
	public void url() {
		System.out.println("Hp--url");
	}
	
	public void header() {
		System.out.println("Hp--header");
	}
	
	public void logOut() {
		System.out.println("Hp--logout");
	}

}
