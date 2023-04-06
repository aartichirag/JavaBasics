package basic.concepts;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;
		
		
		//Comparison Operators: >, <, >=, <=, !=	
		if(a>b) {
			System.out.println("a is grater than b");
		}
		else {
			System.out.println("b is grater than a");
		}
		
		//Nested if else
		if (a>b & a>c) {
			System.out.println("a is grater");	
		}
		else if(b>c) {
			System.out.println("b is grater");
		}
		else {
			System.out.println("c is grater");
		}

	}

}
