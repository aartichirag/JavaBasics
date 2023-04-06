package oop.interfacee;

public interface USMed {
	
	//can not have business logic [means can not have main method]
	//no method body...only method declaration
	//we can declare variables in the interface but those will be static/final by default
	//no main method
	//can not create obj of interface
	//interface by default abstract in nature
	//can not create constructor of interface
	//interface is a 100% abstraction
	
	//non static method
	public void physio(); //only declare method
	public void oncology();
	public void cardio();
	
	//After java jdk 1.8 -- we can create static method with body
	public static void billing() {
		System.out.println("US--billing");
	}
	
	//we can have default method with method body --non static
	default void medInsurance() {
		System.out.println("US--medInsurance");
	}
	
	

}
