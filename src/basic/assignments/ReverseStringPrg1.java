package basic.assignments;

public class ReverseStringPrg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q- Reverse a String. [String s = “SELENIUM”]

		//1st way
		String str="SELENIUM";
		String rev="";
		
		System.out.println("Orignal String is: " +str);
		int len=str.length(); //length of a string
		for(int i=len-1; i>=0; i--) //7
		{
			rev=rev+str.charAt(i);
		}
			System.out.println("Reverse String is: " +rev);
			
		//2nd way
			
			StringBuffer sf = new StringBuffer(str);
			System.out.println(sf.reverse());
		}
		
	
	}


