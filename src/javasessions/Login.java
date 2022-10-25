package javasessions;

public class Login {
	
	String username;
	String password;
	
	public Login(String uname,String password) {
		this.username=uname;
		this.password=password;
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("username is"+un);
		System.out.println("password is"+pwd);
		System.out.println("logged");
		
	}
	

	public static void main(String[] args) {
		
		Login u1 =new Login("Naveen","Naveen@1");
		u1.doLogin(u1.username, u1.password);
		

	}

}
