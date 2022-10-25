package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> Year = new ArrayList<Integer>();

		Year.add(2000);
		Year.add(2001);
		Year.add(2002);
		Year.add(2003);
		System.out.println(Year.get(2));

		Year.remove(2);
		// after remove method value got shifted
		System.out.println(Year.get(2));

		// Year.add(8,1000); //we cant't bypass the index

		System.out.println("-------------------");

		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(56);
		age.add(45);
		age.add(67);

		System.out.println(age); // Print arraylist directly
		System.out.println("-------------------");

		int year[] = { 23, 45, 64, 23 };
		System.out.println(Arrays.toString(year));// To print static array

		int month[] = new int[2];
		month[0] = 3;
		month[1] = 4;
		System.out.println(Arrays.toString(month));
		System.out.println("-------------------");
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(34);
		ar.add(45);
		ar.add(56);
		
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(565);
		ar1.add(466);
		ar1.add(566);
		
		ar.addAll(ar1);//ar madhe ar1 chya value add karaychya aslya tr
		System.out.println(ar);
		
        Collections.sort(ar);
        System.out.println(ar);//ascending order sort
        Collections.sort(ar,Collections.reverseOrder());
        System.out.println(ar);//discending order sort
        
        Collections.swap(ar, 1, 2);
        System.out.println(ar);//index value swap karaysathi
        
        ar.clear();//array clear karaysathi
        System.out.println(ar);
        
        if (ar.contains(566)) {
        	System.out.println("prsese");
        }
        else {
        	System.out.println("no");
        }
        
	}

}
