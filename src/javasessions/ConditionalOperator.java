package javasessions;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a = 23;
		int b = 56;
		if(a<=b) {
			System.out.println("a is less than or equal to b");}
		else {
			System.out.println("not equal to");
		}
		
		
		
		//boolean flag = true;
			if(true) {
			 System.out.println("sds");
			}
			//else {//dead code
			//	System.out.println("cdsffdfg");
			//}
			
			
			int marks = 93;
			
			if(marks<=100) {
				System.out.println("Pass");
				if(marks>=90) {
					System.out.println("A grade");
					if(marks>95) {
						System.out.println("100 % dis");
					}
					else {
						System.out.println("70% dis");
					}
				}
				else {
					System.out.println("B grade");
				}
			}
			else {
				System.out.println("invalid");
			}
			
			/*String browser = "chrome";
			if(browser.equals("chrome")) {
				System.out.println("launch chrome");
			}
			if(browser.equals("safari")) {             // bad code for performance
				System.out.println("launch safari");
			}
			if(browser.equals("ie")) {
				System.out.println("launch ie");
			}
			else {
				System.out.println("pass ri8 browser");
			}
		*/
			String browser = "chrome";
			if(browser.equals("chrome")) {
				System.out.println("launch chrome");
			}
			else if(browser.equals("safari")) {             // bad code for performance
				System.out.println("launch safari");
			}
			else if(browser.equals("ie")) {
				System.out.println("launch ie");
			}
			else {
				System.out.println("pass ri8 browser");
			}
		}
	}


