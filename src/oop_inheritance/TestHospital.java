package oop_inheritance;

public class TestHospital {

	public static void main(String[] args) {
		Apollo a =new Apollo();//only hospital methods and apollo we acess
		a.doctor();
		a.facilities();
		a.premiumWard();
		a.ambulance();
		
		System.out.println("-------------- ");
		Fortis f =new Fortis();//only hospital methods and fortis we acess
		f.doctor();
		f.facilities();
		f.mediClaim();
		f.ambulance();
		
		System.out.println("-------------- ");
		Max m =new Max();//only hospital methods and max we acess
		m.doctor();
		m.facilities();
		m.experieceDoctor();
		m.ambulance();
		
		Hospital h= new Hospital();//only hospital methods we acess
		h.doctor();
		h.ambulance();
		h.facilities();
		
		//top casting
		
		Hospital h1 =new Apollo();
		h1.doctor();
		h1.ambulance();
		h1.facilities();
		//h1.premiumWard ref check failed
		
		Hospital h2 =new Fortis();
		h2.doctor();
		h2.ambulance();
		h2.facilities();
		//h2.mediClaim//ref check failed
		
		Hospital h3 =new Fortis();
		h3.doctor();
		h3.ambulance();
		h3.facilities();
		//h3.experience doctor//ref check failed
		
		//down casting
		
		//Apollo a1 = (Apollo)new Hospital();
		//a1.doctor();
		
		//Max m1 = (Apollo)new Hospital();
				//m1.doctor();
		
		//Fortis f1 = (Apollo)new Hospital();
				//f1.doctor();
		
		
		
		
		
		

	}

}
