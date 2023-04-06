package basic.concepts;

public class MethodOverloading {
	
	//Method Overloading - Same method name with different number of arguments and different data type within the same class.
	//Method duplication is not allowed.
	
		public void sum(int a) {
			System.out.println("1st input parameter");
		}
		
		public void sum(int a, int b) {
			System.out.println("2nd input parameter");
		}
		public void sum(double d) {
			System.out.println("input double parameter");
		}
		
		//Q- Can we override main method?
		//Ans- Yes, we can override main method with different argument and different data types.
		
		public static void main(int a) {
			System.out.println("main method -2");
		}	
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj= new MethodOverloading();
		
		//we have to use object to use non static methods.
		obj.sum(10);
		obj.sum(10, 20);
		obj.sum(30.55);
		
		//static and Non-static method concept::
		
		//direct calling
		main(5); //static method
		
		//calling by classname:
		MethodOverloading.main(10);
		
		//Q - can use static method through object?
		//Ans - Yes, we can use this but that's not a standard.
		//obj.main(7); 
		
		

		
	
	
	}
	

}
