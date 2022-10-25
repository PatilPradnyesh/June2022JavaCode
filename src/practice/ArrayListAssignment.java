
package practice;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {
		/*1. Write a Java program to create a new array list,o
		                 *  add some colors (string) and print out the collection*/
		
		ArrayList <String> Colours = new ArrayList <String> ();
		Colours.add("Red");
		Colours.add("Blue");
		Colours.add("White");
		Colours.add("Black");
		
		for(String e:Colours) {
			System.out.println(e);
		}
		System.out.println(Colours.size());
		
		System.out.println("______________");
		
		/* 2. Write a Java program to insert
		 *  an element into the array list at the first and last positions.*/
		Colours.add(0,"Violet");
		Colours.add(Colours.size(),"Brown");
		
		for(String e:Colours) {
			System.out.println(e);
		}
		
		System.out.println("______________");
		
		/* 3. Write a Java program to retrieve an element
         * (at a specified index) from a given array list.
		                 */
		
		System.out.println(Colours.get(3));
		
		System.out.println("______________");
		
		/* 4. Write a Java program to update specific array element by given element.*/
		Colours.set(0, "Yellow");
		System.out.println(Colours.get(0));
		
		System.out.println("______________");
		/* 5. Write a Java program to remove the third  element from a array list. 
		                 * 
		                 */
		Colours.remove(2);
		System.out.println(Colours.get(2));
		
		System.out.println("______________");
		
		/* 6. Write a Java program to search an element in a array list.
		        * 
		        */
		
		for(String e:Colours) {
			System.out.println(e);
		}
		
		if(Colours.contains("Red")) {
			System.out.println("Red is there");
		}
		else {
			System.out.println("Red is not there");
		}
		System.out.println("______________");
		/* 7. Write a Java program to reverse elements in a array list
		                         *         
		                         */
        for(int i=Colours.size()-1;i>=0;i--) {
        	System.out.println(Colours.get(i));
        }
		

	}

}
