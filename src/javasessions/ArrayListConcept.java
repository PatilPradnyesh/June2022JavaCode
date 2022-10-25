package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList empAge =new ArrayList();
		
		empAge.add(100);
		empAge.add(45);
		
		System.out.println(empAge.get(0));
		//System.out.println(empAge.get(5)); ---IOB
		System.out.println(empAge.size());
		
		for(int i=0;i<empAge.size();i++) {
			System.out.println(empAge.get(i));
		}
		//Reverse order
		for(int i=empAge.size()-1;i>=0;i--) {
			System.out.println(empAge.get(i));
		}
		

	}

}
