package method;

public class Product {
	
	public int product(int a,int b) {
		int muliplication=a*b;
		return muliplication;
	}

	public static void main(String[] args) {
		Product pr =new Product();
		System.out.println(pr.product(2, 4));

	}

}
