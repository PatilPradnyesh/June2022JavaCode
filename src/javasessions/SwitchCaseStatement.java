package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		String browser = "firefo";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;

		default:
			System.out.println("ri8 browser");
			break;
		}

	}

}
