package oop_interface;

public class ChromeDriver implements WebDriver {
	
	ChromeDriver(){
		System.out.println("Launch Chrome");
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
