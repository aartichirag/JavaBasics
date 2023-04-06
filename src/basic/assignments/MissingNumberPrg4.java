package basic.assignments;

public class MissingNumberPrg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array should not have duplicates
		//Array no need to be sorted order
		//Values should be in range
		
		//Q- Find a missing number. [int a[] = {1,2,3,5}]
		
		int a[]= {1,2,3,5};
		
		//sum1: 1+2+3+5=11 [original array list]
		//sum2: 1+2+3+4+5=15 [include missing number]
		//Missing Number: sum2-sum1 = 15-11 = 4
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elementn of array: "+sum1);
		
		for(int i=1;i<=5; i++) //i=1 bcz total number of range
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of element in array:" +sum2);
		System.out.println("Missing Number: "+(sum2-sum1));
		

	}

}
