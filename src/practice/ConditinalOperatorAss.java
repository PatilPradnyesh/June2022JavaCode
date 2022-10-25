package practice;

public class ConditinalOperatorAss {

	public static void main(String[] args) {
		int a = 32;
		int b = 73;
		int c = 56;
		
		if (a>b&&a>c) {
				System.out.println("Greatest No. is :" + a);	
		}
		if (b>a&&b>c) {
			System.out.println("Greatest No. is :" + b);	
	    }
		else {
			System.out.println("Greatest No. is :" + c);	
	    }
		
		int n=-35;
		if (n>0) {
			System.out.println("positive No. is :" + n);
			}
		else{
			System.out.println("negative No. is :" + n);
			}
	}
	
}


