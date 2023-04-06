package basic.concepts;

public class TestBlock {
	
	//static block
	static {
		System.out.println("static block");
	}
	
	
	public void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {

		System.out.println("main method");
		
		TestBlock tb = new TestBlock();
		tb.test();
		
	}

}
