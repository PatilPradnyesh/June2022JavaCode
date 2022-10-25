package javasessions;

public class ForEachLoop {

	public static void main(String[] args) {
		Object emp[] = new Object[4];
		emp [0] =1;
		emp [1] ="Maveen";
		emp [2] ='m';
		emp [3] =345.5;
		for(Object e: emp) {
			System.out.println(e);
		}

	}

}
