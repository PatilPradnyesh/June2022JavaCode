package practice;

public class ArraysAssignment {

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) {
			for(int k=1;k<10;k++) {
				System.out.print(i+""+k+"\t");
			}
			System.out.println();
		}
	
	
	/*Question 2: Write a program to create a static Array, having following cricket data:
	                        --name, age, team name, DOB, gender, Strike Rate
	                        --Try to create multiple Object Arrays for different players 
	                        --Try to print all the values of each player on the console*/
           Object player[]=new Object[5];
           player[0]="Shubham";
           player[1]="Mumbai";
           player[2]="15/01/2000";
           player[3]='M';
           player[4]=200;
           
           for(Object e:player) {
        	   System.out.println(e);
           }
           
	
	}
}
