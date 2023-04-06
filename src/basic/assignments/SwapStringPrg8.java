package basic.assignments;

public class SwapStringPrg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q- Swap two string variables. [String a = “Hello” and String b = “World”]
		
		String a="Hello";
		String b="world";
		String c; //Third Variable
		
		System.out.println("Before Swapping: " +a+ " "+b);	
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping: " +a+ " "+b);

	}

}
