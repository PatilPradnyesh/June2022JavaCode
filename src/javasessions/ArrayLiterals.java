package javasessions;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		int i[]= {12,21,23,22};
		System.out.println(i[2]);
		
		int len= i.length;
		System.out.println(len);
		
		for(int e:i) {
			System.out.println(e);
		}

	}

}
