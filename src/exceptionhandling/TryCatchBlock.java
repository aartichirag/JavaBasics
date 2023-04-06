package exceptionhandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		//Different types of exceptions:
		//Arithmetic Exception, Null pointer Exception, ArrayIndexOutOfBound Exception, NoSuch Element
		
	
		try{
			int i =9/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			System.out.println("some exception");
			e.printStackTrace();
		}
	
		int a=10;
		System.out.println(a);

	}

}
