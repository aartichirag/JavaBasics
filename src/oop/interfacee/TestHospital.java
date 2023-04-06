package oop.interfacee;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardio();
		fh.dental();
		fh.entService();
		fh.oncology();
		fh.ortho();
		fh.pedia();
		fh.physio();
	//	fh.billing(); //not used bcz static 
		fh.medInsurance(); //non-static
		
		//inheritance part
		fh.medicalInfo();
		fh.covidGuide();
		
		//top casting: child class obj can be refereed by parent interface reference variable
		
		USMed us = new FortisHospital();
		us.physio();
		us.cardio();
		us.cardio();
	//	us.entService();
		
		//down casting: parent interface obj can be referred by child class reference variable
		
	//	FortisHospital fh1	=  new USMed(); //this is not possible

	}

}
