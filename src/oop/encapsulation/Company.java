package oop.encapsulation;

public class Company {
	
	//variable encapsulation
	public String name;
	private int sharePrice;
	public String hq;
	
	//private class use this method [right click on "source" and "Generate getters and setters"]
	
	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public static void main(String[] args) {
		
		Company obj = new Company();
		obj.name="IBM";
		obj.sharePrice=100;
		

	}

}
