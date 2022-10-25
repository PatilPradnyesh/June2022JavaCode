package exception_handling;

public class Throw {

	public static void main(String[] args) {
		
		//throw keyword is used to define new exception
		
		try {
			throw new Exception ("No data found exception"); 	
		}
		catch(Exception e) {
			System.out.println("nodatafound");
		}

	}

}
