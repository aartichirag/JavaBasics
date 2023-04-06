package basic.concepts;

public class ForWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop
		
		int i=1;
		
		System.out.println("While Loop Output");
		while(i<=10) {
			System.out.println(i);
			i++; //i=i+1 (both can use)
		}
		
		//for loop 
		System.out.println("For Loop Output with increment");
		for(int j=0; j<=10; j++) //[initlization, condition, increment/decrement]
		{
			System.out.println(j);
		}

		System.out.println("For Loop Output with decrement");
		for(int j=10; j>=1; j--) //[initlization, condition, increment/decrement]
		{
			System.out.println(j);
		}

	}

}
