package basic.concepts;

import java.util.ArrayList;

public class Customer {

	//Switch Case
	public void doSearch(String productName) {
		System.out.println("Searching the product: " +productName);
		
	//dynamic list array
		ArrayList<String> prodList =new ArrayList<String>();
		
	switch (productName) {
	
	case "Apple":
		System.out.println("Apple");
		prodList.add("iph12");
		prodList.add("mackbook pro");
		prodList.add("ipad mini");
		System.out.println(prodList);
		break;
		
	case "Samsung":	
		System.out.println("Samsung");
		prodList.add("s8");
		prodList.add("laptop pro");
		prodList.add("sam tab");
		System.out.println(prodList);
		break;
		
	case "HP":
		System.out.println("HP");
		break;
		
	default:
		System.out.println("No match found");
		System.out.println(prodList);
		break;
	}
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer();
		c1.doSearch("Apple");

	}

}
