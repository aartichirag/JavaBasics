package basic.concepts;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Increment the output....");
		int i=10;
		System.out.println("i:" +i);
		int j=i++; //Post Incremental
		System.out.println("j:" +j);
		System.out.println("i:" +i);
		
		//Pre Incremental
		int k=++i;
		System.out.println("k: " +k);
		System.out.println("i: " +i);
		
		//Decrement
		System.out.println("Decrement the output....");
		int m=5;
		System.out.println("m: " +m);
		int n= m--; //post decrement
		System.out.println("n: " +n);
		System.out.println("m: " +m);
		
		int o= --m; //pre decrement
		System.out.println("o: " +o);
		System.out.println("m: " +m);
	}

}
