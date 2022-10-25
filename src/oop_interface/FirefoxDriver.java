package oop_interface;

public class FirefoxDriver implements WebDriver {
	
	FirefoxDriver(){
		System.out.println("Launch Firefox");
	}

	@Override
	public void getTitle() {
		System.out.println("amazon");
		
	}

	@Override
	public void click() {
		System.out.println("click on login");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("write un and pwd");
		
	}

}
