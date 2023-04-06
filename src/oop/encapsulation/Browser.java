package oop.encapsulation;

public class Browser {
	
	//method encapsulation
	
	public void launchBrowser() {
		System.out.println("launchBrowser");
		//non static 
		checkVersion();
		checkOsVersion();
		checEnoughRAM();
	}
	
	private void checkVersion() {
		System.out.println("checkVesrion");
	}
	
	private void checkOsVersion(){
		System.out.println("checkOsVesrion");
	}
	
	private void checEnoughRAM(){
		System.out.println("checEnoughRAM");
	}
}
