package basic.concepts;

public class Car_StaticAndNonStatic_Variable {
	
	String name;
	int price;
	String color;
	static int wheel= 4; //All car wheels is 4 given to all object variable inside the main method  
	

	public static void main(String[] args) {
		
		Car_StaticAndNonStatic_Variable c1=new Car_StaticAndNonStatic_Variable();
		c1.name="BMW";
		c1.price=60;
		c1.color="Black";
	//	c1.wheel;//not use bcz alreay in static that's why 
		
		Car_StaticAndNonStatic_Variable c2=new Car_StaticAndNonStatic_Variable();
		c2.name="Audi";
		c2.price=50;
		c2.color="Blue";
		
		// static keyword both way use of print statement
		System.out.println(Car_StaticAndNonStatic_Variable.wheel); //this is correct way
		System.out.println(wheel);
		
		Car_StaticAndNonStatic_Variable c3=new Car_StaticAndNonStatic_Variable();
		c3.name="Honda";
		c3.price=20;
		c3.color="White";
		System.out.println(c1.name+" "+c1.price+" "+c1.color);
	//	System.out.println(c1.name+" "+c1.price+" "+wheel+" "+c1.color);
	}
}
