package oop_interface;

public class TestDriver {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String browser="firefox";
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}
		
		driver.getTitle();
		driver.click();
		driver.sendKeys();
		
		
		

	}

}
