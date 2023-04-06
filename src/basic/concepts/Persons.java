package basic.concepts;

public class Persons {
	
	//method chaining
	
	public void m1() {
		System.out.println("m1");
		m2(); //non static method
	}
	
	public void m2() {
		System.out.println("m2");
		m3();
	}
	
	public void m3() {
		System.out.println("m3");
	}
	
	//m1, m2, m3 is non static method it's called directly each other
	//main method is static but create an object use to reference variable
	
	public static void main(String[] args) {

		Persons p1 =new Persons();
		p1.m1();

	}

}
