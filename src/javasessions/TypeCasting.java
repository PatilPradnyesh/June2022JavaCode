package javasessions;

public class TypeCasting {

	public static void main(String[] args) {
		//widening casting -auto conversion of lower data type to higher
		byte b =22;
		short s =b;
		int c=s;
		long l =c;
		System.out.println(s);
		System.out.println(c);
		System.out.println(l);
		
		
		
		
		//narrowing casting -(explicityly tell) conversion of higher data type to lower
		long l1 = 20;
		int i1 =(int)l1;
		short s1 =(short)i1;
		byte b1 =(byte)s1;
		
		System.out.println(l1);
		System.out.println(s1);
		System.out.println(b1);
		
		byte b2=(byte)(l1+l1);
		
		System.out.println(b2);
		
		
		
		
		
		
		
	}

}
