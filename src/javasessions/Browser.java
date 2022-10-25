package javasessions;

public class Browser {
	
	public boolean launchBrowser(String brName) {
		System.out.println("Launching browser"+brName);
		switch (brName.toLowerCase()) {
		case "chrome":
			System.out.println("Luanch chrome browser");
			return true;
			
		case "safari":
			System.out.println("Luanch safari browser");
			return true;
			
		case "opera":
			System.out.println("Luanch opera browser");
			return true;	

		default:
			System.out.println("pass right browser");
			return false;
		}
	}

	public static void main(String[] args) {
		
		Browser b=new Browser();
		boolean flag =b.launchBrowser("chRome");
		System.out.println(flag);
		
		if(flag) {
			System.out.println("amazon.com");
		}

	}

}
