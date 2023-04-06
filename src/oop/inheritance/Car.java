package oop.inheritance;

public class Car extends Vehicle {
	
	//Static method can not be overridden
		//Ex: public static class Car extends Vehicle {
	
	//final class can not be a parent class [final keyword means can not override or inheritance property]
		// Ex: public final class Car extends Vehicle{
	
	
	public void start() {
		System.out.println("car--start");
	}	
	//final method can not be overridden
		//Ex: public final void start() {}

	public void stop() {
		System.out.println("car--stop");
	}
	
	public void refuel() {
		System.out.println("car--refuel");
	}
}
