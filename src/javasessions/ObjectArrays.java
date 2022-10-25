package javasessions;

public class ObjectArrays {

	public static void main(String[] args) {
		Object emp[] = new Object[4];
		emp [0] =1;
		emp [1] ="Maveen";
		emp [2] ='m';
		emp [3] =345.5;
		System.out.println(emp[3]);
		for(int i=1;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		
	}

}
