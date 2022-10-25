package javasessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList <Integer> age=new ArrayList<Integer>();
		age.add(10);
		age.add(23);
		age.add(144);
		age.add(103);
		age.add(1023);
		
		System.out.println(age.size());
		
		for(int i=0;i<age.size();i++) {
			System.out.println(age.get(i));
		}
		
		for(int e:age) {
			System.out.println(e);
		}
		
		for(int i=age.size()-1;i>=0;i--) {
			System.out.println(age.get(i));
		}
		System.out.println("'''''''''''-------");
		//multiple data types
		ArrayList <Object> empdata=new ArrayList<Object>();
		empdata.add("Shubham");
		empdata.add(56);
		empdata.add('M');
		empdata.add(true);
		empdata.add(23.89);
		
		for(Object e: empdata) {
			System.out.println(e);
		}
	}

}
