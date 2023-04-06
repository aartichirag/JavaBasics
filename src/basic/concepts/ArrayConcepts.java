package basic.concepts;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Array index start from 0(zero)
		//1. int Array
		int i[] = new int[3]; //0,1,2 ---lower bound ---upper bound
		i[0]=10;
		i[1]=20;
		i[2]=30;
		System.out.println("Value of int array:" +i[2]);
		
		//2. Double Array
		double d[] = new double[2]; //0,1
		d[0]=10.15;
		d[1]=20.15;
		System.out.println("Value of double array:" +d[1]);
		//System.out.println(d[2]); //ArrayIndexOutOfBoundException
		
		//3. Char Array
		char c[]=new char[2]; //0,1
		c[0]='A';
		c[1]='P';
		System.out.println("Value of char array:" +c[0] +" "+c[1]);
		
		//3. String Array
		String s[]=new String[2]; //0,1
		s[0]="Aarti";
		s[1]="Patel";
		s[2]="123";
		System.out.println("Value of string array:" +s[0] +" "+s[1]);
		
		//4.Float Array
		float f[] = new float[2]; //0,1
		f[0]=15.10f;
		f[1]=25.10f;
		System.out.println("Value of float array:" +f[1]);
		
		//5. Boolean Array
		boolean b[] = new boolean[2]; //0,1
		b[0]=true;
		b[1]=false;
		System.out.println("Value of boolean array:" +b[0]);
		
		//Q: why need an object array?
	    //Ans: If we use object array we can use any value inside there 
		
		//6. Object Array
		Object o[] = new Object[3]; //0,1,2
		o[0]="Hello";
		o[1]="D";
		o[2]=123;
		System.out.println("Value of object array:" +o[2]);
		
		
		

	}

}
