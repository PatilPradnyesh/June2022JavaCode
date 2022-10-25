package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a= 100;
		int b= 200;
		
		String x = "Hello";
		String y = "world";
		
		double d1 = 12.32;
		double d2 = 12.32;
		
		char c = 'a';
		char c1='b';
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(x+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+(c+c1));
		System.out.println(x+y+c+c1);
		System.out.println(x+y+(d1+d2));
		System.out.println(x+y+d1+d2);

	}

}
