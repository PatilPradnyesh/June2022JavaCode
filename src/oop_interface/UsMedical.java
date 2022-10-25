package oop_interface;

public interface UsMedical extends WHO, UN{
	
	int fee=20;//static and final in nature
	
	public void neauroServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	//after jdk 1.8 we can write mthod body with
	//1)static //we can do method hiding
	public static void mBody() {
	  System.out.println("MBody with static");
	}

	//2)default//we can override this
	default void dMBody() {
		System.out.println("default m body");
	}
}
