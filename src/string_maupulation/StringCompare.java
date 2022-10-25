package string_maupulation;

public class StringCompare {

	public static void main(String[] args) {
		
		String str1 ="Java";
		String str2 ="Java";
		
		System.out.println(str1==str2);//true
		
		String str3 =new String("Java");
		
		System.out.println(str1==str3);//false
		System.out.println(str2==str3);//false
		
		System.out.println(str1.equals(str3));//true
		System.out.println(str2.equals(str3));//true
		
		//== this is used for comparison based on references
		//equals method is used for comparison based on values
		//equals method is best practice
		
		
		
		
       

	}

}
