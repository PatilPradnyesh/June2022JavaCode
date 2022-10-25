package javasessions;

public class Application {

	// Method overloading : coompile time polymorphism
	// this is in the same class with same method name
	// having different number of parameters and different sequence of parameters
	// return not impact overloading
	///user friendly 

	public void login() {

	}

	public void login(String userName, String passWord) {

	}

	public void login(String userName, String passWord, int oTP) {

	}

	public void login(String userName, String passWord, String designation) {

	}

	// search

	public void search() {

	}

	public String search(String prdName) {
		return "shubham";
	}

	public void search(String prdName, int price) {

	}

	public void search(String prdName, int price, String colour) {

	}

	// uber- booking
	public void booking(String strPoint, String endPoint) {

	}

	public void booking(String strPoint, String endPoint,String carType) {

	}
	
	public void booking(String strPoint, String endPoint,String carType,String couponCode) {

	}
	
	//payment method
	

	public static void main(String[] args) {

		Application obj = new Application();
		obj.login("pasa", "as");

	}

}
