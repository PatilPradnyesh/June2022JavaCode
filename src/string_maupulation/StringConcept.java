package string_maupulation;

public class StringConcept {

	public static void main(String[] args) {
		
		String str =" I am java";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(str.length()-1));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.contains("am"));
		
		System.out.println(str.indexOf("a"));
		
		System.out.println(str.indexOf("am"));
		
		System.out.println(str.indexOf("a", str.indexOf("a")+1));
		
		System.out.println(str.replace( " ", "_"));
		
		System.out.println(str.trim());
		
		
		
		
	}

}
