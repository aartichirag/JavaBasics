package oop.inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW  b = new BMW(); //child object
		b.start();
		b.stop(); //child class can have method of parent class as well
		b.refuel();
		b.autoParking();
		b.engine();
		
		Car c = new Car(); //parent object
		c.start();
		c.stop();
		c.refuel();
	//	c.autoParking();//Child class can not have multiple parent class
		c.engine();
		
		//Top Casting: Child class obj can be referred by parent class obj reference variable
		Car c1 =new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
//		c.autoParking(); //not used
		c1.engine();
		
		//Down Casting: Parent class obj can be referred by child class reference variable [it is not possible]
		//BMW b1 = new Car();
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.thefSafety();
		a.sportsMode();
		a.engine();
	  //a.autoParking();
		

	}

}
