package string_maupulation;

public class StringTest {

	public static void main(String[] args) {
		
		String str ="java";
		String str1 ="java";
		//as of 1 object created in string constant pool
		String str2 ="Java";
		//as of 2 object created in string constant pool
		//above is String literals
		//it is created in SCP
		
		
		String str3 = new String("I am java");
		//above is string object creation
		//the above method will create 2 obkects one in SCP and one in heap
		
		String str4 =new String ("I am java");
		//above method will create 1 object only in heap because one object already created in SCP
		
		//so because of above code 5 object created

	}

}
