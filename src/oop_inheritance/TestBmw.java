package oop_inheritance;

public class TestBmw {

	public static void main(String[] args) {
		
		Bmw b= new Bmw();
		b.start();//overriden method
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//indivisual
		b.engine();//method inherited from grand parent class
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//top casting child class object referred by parent class reference variable
		Car c1 =new Bmw();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		//c1.autoParking(); cant acces as ref type check failed
		
	    Vehicle v=new Bmw();
	    v.engine();
	    //not other methods we can access because of ref type check failed
	    
		
		//down casting -parent class object reffered by child class reference variable
		//Bmw b1=(Bmw)new Car();//down casting not allowed
		//b1.start();//class cast exception
	    
	  //  Bmw b2 =(Bmw)new Vehicle();
	    //b2.start();
        
	}

}
