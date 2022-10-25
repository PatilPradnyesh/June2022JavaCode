package method;

public class Factorial {
	
	public int getFactorial(int n) {
		int fact =1;
		if(n>0) {
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		}
		
		else {
			fact =0;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		
		Factorial f=new Factorial();
		System.out.println(f.getFactorial(1));
		

	}

}
