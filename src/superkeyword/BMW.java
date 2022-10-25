package superkeyword;

public class BMW extends Car {
	
	int minSpeed=200;
	
	@Override
	public void mileage() {
		System.out.println("18");
		super.mileage();//calling parent method with super keyword
	}
	
	public void getSpeed() {
		System.out.println(super.minSpeed);//calling parent class prperties using super
	}
	

	

}
