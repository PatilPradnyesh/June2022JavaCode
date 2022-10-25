package method;

public class OddEven {
	
	public void getOddEven(int i) {
		
		if(i%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
		
		
	}

	public static void main(String[] args) {
		OddEven oe =new OddEven();
		oe.getOddEven(76687);
		

	}

}
