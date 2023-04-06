package basic.concepts;

public class Browser {
	
	String name;
	double version;
	String vendor;
	
	public void getInfo(Browser br) {
		System.out.println(br.name+" "+br.version+" "+br.vendor);
	}
	

	public static void main(String[] args) {
		
		Browser b=new Browser();
		b.name="chrome";
		b.version=64.1;
		b.vendor="Google";
		
		b.getInfo(b);
		
		

	}

}
