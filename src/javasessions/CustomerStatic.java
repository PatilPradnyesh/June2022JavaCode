package javasessions;

public class CustomerStatic {
	String name;
	int age;
	static String comName ="Amazon";
	
	public void sendMail() {
		System.out.println("sendmail");
	}
	
	public static void getInfo() {
		System.out.println("sendmail");
	}

	public static void main(String[] args) {
		CustomerStatic cs =new CustomerStatic();
		cs.name="Priyanka";
		cs.age=23;
		cs.sendMail();
		System.out.println(cs.name+" "+cs.age+" "+CustomerStatic.comName );
		
		//ways of calling static method
		//by class name --CustomerStatic.comName
		//directly comName
		//by refere cs.comName
		

	}

}
