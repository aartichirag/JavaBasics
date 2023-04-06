package oop.inheritance;

public class BMW extends Car{
	
	//method overriding: to check this method @Override
	
	@Override
	public void start() {
		System.out.println("BMW start");
	}
	

	public void autoParking() {
		System.out.println("BMW--autoparking");
	}
	

}
