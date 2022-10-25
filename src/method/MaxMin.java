package method;

public class MaxMin {
	
	public int maximum(int a,int b,int c) {
		
		if(a>b&&a>c) {
			System.out.println("Maximum number is");
			return a;
		}
		else if(b>a&&b>c) {
			System.out.println("Maximum number is");
			return b;
		}
		else
			System.out.println("Maximum number is");
		    return c;
		
	}

	public static void main(String[] args) {
		MaxMin m = new MaxMin();
		System.out.println(m.maximum(64633, 5455, 665));

	}

}
