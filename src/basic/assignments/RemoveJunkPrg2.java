package basic.assignments;

public class RemoveJunkPrg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q - Remove junk or special character from a string. [String s = “Sele.,niu><m”]
		
		String s="Sele.,niu><m";
		System.out.println("Before String:" +s);
		
		// ^ sign means charAt operates
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After String: "+s);

	}

}
