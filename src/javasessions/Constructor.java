package javasessions;

public class Constructor {
	
	//constructor name is same as class name
	
	String username;
	String password;
	
	public Constructor(String username, String password ) {
		this.username=username;//this used initialise class variable
		this.password=password;
		
	}
	
	public Constructor(String username ) {
		this.username=username;//this used initialise class variable
		
		
	}
	
	
	
	public void doLogin(String username,String password) {
		System.out.println("username is:"+username);
		System.out.println("logged in sucessfully");
		
	}
	
	
	public static void main(String[] args) {
		Constructor cs=new Constructor("Shubham","Shubham@1");
		
		cs.doLogin(cs.username, cs.password);
		

	}

	

}
