package practice;

import java.util.ArrayList;

public class MethodOverloading {
	
	public int searchRestrau(String rName) {
		String name="RajGarden";
		if(name.equalsIgnoreCase(rName)) {
			return 100;
		}
		else {
			return -1;
		}
		
	}
	
	public ArrayList<String> searchRestrau(String rName, String fItem) {
		String name="RajGarden";
		ArrayList<String>List=new ArrayList<String>();
		if(name.equalsIgnoreCase(rName)) {
			
		     List.add(rName);
		     List.add("Burger");
		     List.add("Pizza");
		     
		}
		else {
			List.add(null);
		}
		return List;
		
		
		
	}
	
	public ArrayList<Object> searchRestrau(String rName, String fItem,int price,char r) {
		String name="RajGarden";
		ArrayList<Object>List=new ArrayList<Object>();
		if(name.equalsIgnoreCase(rName)) {
			
		     List.add(rName);
		     List.add(fItem);
		     List.add(price);
		     List.add(r);
		     
		     
		}
		else {
			List.add(null);
		}
		return List;
		
		
		
	}

	public static void main(String[] args) {
		
		MethodOverloading mo =new MethodOverloading();
		System.out.println(mo.searchRestrau("rajgarden", "Fooditems"));
		System.out.println(mo.searchRestrau("rajgarden", "burger", 1200, '5'));
		
		

	}

}
