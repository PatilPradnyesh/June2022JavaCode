package method;

public class SumMethod {
	//1.Write a program to print the sum of two numbers entered by user by defining your own method
	
	public int sum(int a,int b) {
		
		int sum =a+b;
		return sum;
		
	}

	public static void main(String[] args) {
		SumMethod sum=new SumMethod();
		int total=sum.sum(256, 655);
		System.out.println(total);
		
		

	}

}
