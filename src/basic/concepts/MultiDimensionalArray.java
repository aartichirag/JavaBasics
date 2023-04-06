package basic.concepts;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static array means hard coded value like [2][3]
		
		String s[][]=new String [2][3]; //first for rows and second for column
		s[0][0]="Tom";
		s[0][1]="Peter";
		s[0][2]="Scott";

		s[1][0]="30";
		s[1][1]="35";
		s[1][2]="40";
		
	//	System.out.println(s.length); //2
		
		for(int row=0; row<s.length; row++) {
			for(int column=0; column<s[0].length; column++) {
				System.out.println(s[row][column]);
			}
		}
	}

}
