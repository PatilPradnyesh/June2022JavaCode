package oop_interface;

public class FortisHospital extends Medical implements UsMedical, UkMedical, IndianMedical {
	
	

	@Override
	public void covidNews() {
		System.out.println("FH-------Covidnews");
		
	}

	@Override
	public void covidVaccination() {
		// TODO Auto-generated method stub
		System.out.println("FH-------CovidVaccination");
		
	}

	@Override
	public void chemoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-------ChemoServices");
		
	}

	@Override
	public void skinServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-------skinsevices");
		
	}

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-------Physioservices");
		
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-------orthoservices");
		
	}

	@Override
	public void neauroServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-------neauroservices");
		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-------dentalservices");
		
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-------emergencyServices");
		
	}

	@Override
	public void guideLines() {
		// TODO Auto-generated method stub
		System.out.println("FH -------guidelines");
		
	}
	
	public void opdServices() {
		System.out.println("FH ------- opdServices");
	}
	
	public static void mBody() {
		  System.out.println("MBody with static");
		}

		//2)default
	@Override
	public void dMBody() {
			System.out.println("default m body");
		}

}
