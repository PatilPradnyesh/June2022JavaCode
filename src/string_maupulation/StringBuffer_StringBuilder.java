package string_maupulation;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		//string - immutable - can't change
		//string builder and buffer - mutable - we change
		//we use string builder nowdays
		
		StringBuilder sb =new StringBuilder("Hello");//it is fast not thread safe and since java1.5 sync
		sb.append("Selenium");
		System.out.println(sb);//helloselenaium
		
		StringBuffer sb1 =new StringBuffer("Hello");//it is slow  thread safe and since java1.0 not sync
		sb1.append("World");
		System.out.println(sb1);//helloworld
		
		String s =new String("Hello");
		s.concat("String");
		System.out.println(s);//hello beause immutable

	}

}
