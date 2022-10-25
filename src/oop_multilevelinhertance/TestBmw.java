package oop_multilevelinhertance;

public class TestBmw {

	public static void main(String[] args) {
		
		Bmw b =new Bmw();
		b.mass();
		
		//top casting we can't acces child indivizual method
		Engineering e =new Bmw();
		e.law();

	}

}
