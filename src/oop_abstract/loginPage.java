package oop_abstract;

public class loginPage extends Page{
	
	public loginPage() {
		System.out.println("loginPage constructor");
	}
	
	public loginPage(int i) {
		super(i);
		System.out.println("loginPage constructor"+i);
	}

	@Override
	public void title() {
		System.out.println("login page title");
		
	}

	@Override
	public void url() {
		System.out.println("login page url");
		
	}
	
	public void resetPwd() {
		System.out.println("reset password");
	}
	
	public void doLogin() {
		System.out.println("do login");
	}

}
