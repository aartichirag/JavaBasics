package basic.concepts;

public class FunctionsInJava {
	
	// we can call the functions/methods from other functions/methods
			
	//3 Types of methods/functions:
		//1)Without return type and without parameter / No input and No return (void)
	    //2)With return type and without parameter / No input but some return
		//3)With return type and with parameters/ some input and some return
			
		//1)Without return type and without parameter / No input and No return (void)
		public void test() {
			System.out.println("Test Method");
			int i=10;
			System.out.println(i);
		}
		
		public void getPrint() {
			System.out.println("Print My Paper");
		}
	
		//2)With return type and without parameter / No input but some return
		
		public int getBalance() {
			System.out.println("Get Balance" );
			int fees=10;
			int tax=5;
			int total = fees + tax;
			System.out.println("Total:" +total);
			return total;
		}
		public String getName() {
			String name="Tom";
			System.out.println("Name:" +name);
			return name;
		}
		
		//3)With return type and with parameters/ some input and some return
		
		public int add(int a, int b) {
			int c=a+b;
			System.out.println("Sum is:" +c);
			return c;
		}
		
		public int getCourseFee(String courseName, String tech) {
			System.out.println("get course fees for:" +courseName);
			if(courseName.equals("Selenium") & tech.equals("Java")) {
				int f1=2000;
				System.out.println(f1);
				return 2000;
			}else if(courseName.equals("API") & tech.equals("Javascript")) {
				int f2=2500;
				System.out.println(f2);
				return 2500;
			}else if(courseName.equals("Mobile") & tech.equals("C#")) {
				int f3=1000;
				System.out.println(f3);
				return 1000;
			}else {
				System.out.println("course is not found");
				int f4=-1;
				System.out.println(f4);
				return f4;
			}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		obj.getPrint();
		
		obj.getBalance();
		obj.getName();
		
		obj.add(10, 20);
		int a1= obj.add(30, 20); 
		System.out.println(a1-10);//minus
		
		obj.getCourseFee("API", "Javascript");
		obj.getCourseFee("Mobile", "C#");
		
	//we can not create a functions/methods inside a functions/methods
		/*
		 * public void getText() {
		 * 
		 * }
		 */
				

	}

}
