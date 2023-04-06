package basic.concepts;

public class ClassAndObject {
	
	int i=20; //Class Variable - Global

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10; //Local Variable
		System.out.println(i);
		
		//created the object of class: use new keyword
		//obj: object reference variable
		//new ClassAndObject() : object
		
		ClassAndObject obj = new ClassAndObject();
		
		//1st way to direct to print
		//System.out.println(obj.i); 
		
		//2nd way to declare to variable and then print
		int j= obj.i;
		System.out.println(j);
		
		//class: it is a template/blueprint/ category for the objects (ex: Car, Employee etc..)
		//object: it is a physical entity --should be created from class category (ex: Aarti)
	}

}
