package basic.assignments;

public class LargeSmallNumberPrg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q-Find largest and smallest number in array. [int a[] = {1,2,3,5}]
		
		int a[]= {1,2,3,5};
		
		int small=a[0]; 
		int large=a[0];
		for(int i=1; i<a.length; i++) { 
			if(a[i] > large) { 
				large=a[i];
			}
			else if(a[i] < small) {
				small=a[i];
			}		
		}
		System.out.println("Largest Number: " +large);
		System.out.println("Smallest Number: " +small);
	}

}
