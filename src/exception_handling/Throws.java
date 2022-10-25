package exception_handling;

public class Throws {
	
	//throws keyword used to pass exception from one method to another
	//actually not handling any exception
	
	public void setNum1() {
		System.out.println("num 1");
		try {
			setNum2();
		}
		catch(ArithmeticException e) {
		 System.out.println("Ar is coming");
		 e.printStackTrace();
		}
		
	}
	
	public void setNum2() {
		System.out.println("num 2");
		 getNum2();
		
	}
	
    public void getNum2() throws ArithmeticException {
    	int i =9/0;
    	System.out.println("get");
    	
		
	}

	public static void main(String[] args) {
		Throws t = new Throws();
		t.setNum1();
		
		
		

	}

}
