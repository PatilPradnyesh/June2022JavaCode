package javasessions;

public class Employee {
	
	//we can't create anther method inside a method
	//methods are independent and parallel to each other
	
	//1)no input no return
	public void test() {
		System.out.println("Test the method");
	}
	
	//2)no input some return
	public int sum() {
		System.out.println("Sum of the numbers");
		int a=23;
		int b=45;
		int total =a +b;
		return total; 
	}
	
	//3)some input some return
	public int getMarks(String studentName) {//return mule slight performance vdhto
		System.out.println("Marks of the student:"+studentName);
		int marks =-1;
		if(studentName.equalsIgnoreCase("Shubham")) {
			//return 90
			 marks =90;
		}
		else if(studentName.equalsIgnoreCase("Mahesh")) {
			//return 94;
			 marks =94;
		}
		else if(studentName.equalsIgnoreCase("pranav")) {
			//return 67;
			 marks =67;
		}
		else {
			System.out.println("Student name not found"+studentName);
			//return -1;
			
		}
		return marks;
	}

	public static void main(String[] args) {
		
		Employee e = new Employee ();
		
		e.test();   //je mthod return nahi karat tyala print statement chi garaj nahi
		
		int z =e.sum();
		System.out.println(z);//return karnarya method la store kerun mg print statement chi garaj aste
		
		int marks =e.getMarks("shuHam");
		System.out.println(marks); //je method input ani return ghete

	}

}
