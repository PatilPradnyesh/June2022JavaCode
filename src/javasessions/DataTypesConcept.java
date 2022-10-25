package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		
		//1) Byte 
		//size- 1 Byte - 8 Bits
		//range- 2^7 to 2^7 -1
		
		byte b = 1;
		System.out.println(b);
		
		//2) Short 
				//size- 2 Byte - 16 Bits
				//range- 2^15 to 2^15 -1
		short s1 = 128;
		System.out.println(s1);
		
		//3) Int 
				//size- 4 Byte - 32 Bits
				//range- 2^31 to 2^31 -1
		int i1 = 323432242;
		System.out.println(i1);
		
		//4) long 
				//size- 8 Byte - 64 Bits
				//range- 2^63 to 2^63 -1
		long l1 = 24234343244444l;
		System.out.println(l1);
		
		//5) float 
		//size- 4 Byte - 32 Bits
		//range- 2^31 to 2^31 -1
		
		float f = 12.44f;
		float f2 =31.32f;
		
		System.out.println(f);
		System.out.println(f+f2);
		
		//6) double 
				//size- 8 Byte - 64 Bits
				//range- 2^63 to 2^63 -1
		double d = 1221212.23123;
		System.out.println(d);
		
		
		//7) char 
		//size- 2 Byte - 16 Bits
		//range- 2^15 to 2^15 -1
		//ascii a-z 97-122
		//A-Z 65-90
		//0-9 48-57
		
		char c = 'a';
		char c1='b';
		System.out.println((int)'b');
		System.out.println(c1);
		System.out.println(c+c1);
		char c5 = '%';
		System.out.println(c5);
		
				
		
		
		//6) boolean 
		//size ~ 1bit
		
		boolean b1 = true;
		System.out.println(b1);
		
		

	}

}
