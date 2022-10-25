package oop_interface;

public class testFH {

	public static void main(String[] args) {
		
		//UN u =new UN(); can't create object of interface
		
		FortisHospital fh = new FortisHospital();
		
		UN u =new FortisHospital();//top casting is allowed
		
		UsMedical um =new FortisHospital();
		
		
		
		
		
		
		u.guideLines();
		
		System.out.println(FortisHospital.fee);
		System.out.println(UsMedical.fee);
		
		
		//can't do down casting with interface
		//multiple inheritance is allowed with interface
		//interface can have multiple parent interface
		//interface can't have class as parent
		//class- class extends
		//class - interface implements
		//interface -interface extends
		//mandatory to implement all interface method
		//extend is before implements
		
		

	}

}
