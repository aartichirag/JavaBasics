package oop.interfacee;

public class FortisHospital extends UNHG implements USMed,UKMed,IndiaMed {

	@Override
	public void physio() {
		System.out.println("FH--physio");	
	}

	@Override
	public void oncology() {
		System.out.println("FH--oncology");	
	}

	@Override
	public void cardio() {
		System.out.println("FH--cardio");
	}

	@Override
	public void entService() {
		System.out.println("FH--entService");	
	}

	@Override
	public void pedia() {
		System.out.println("FH--pedia");	
	}

	@Override
	public void ortho() {
		System.out.println("FH--ortho");	
	}

	@Override
	public void dental() {
		System.out.println("FH--dental");	
	}
		
}
