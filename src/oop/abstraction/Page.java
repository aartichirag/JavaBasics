package oop.abstraction;

public abstract class Page {
	
	//abstract class obj can't be created
	//It can have abstract and non abstract methods as well
	//can't create obj of abstract class
	
	
	public abstract void title(); //absract declaration
//	public abstract void footer();
	
	//non-abstract with body
	public void header(){
		System.out.println("page--header");
	}
	
	public final void logo(){
		System.out.println("page--logo");
	}
	
	//abstract class constructor can be created
	public Page() {
		System.out.println("default--page");
	}
	
	//constructor method overloading
	public Page(int a) {
		System.out.println("one int--page");
	}
	
}
