package javasessions;

public class MainMethodOverLoading {

	public static void main(String[] args) {
	System.out.println("hi");
	
	
	MainMethodOverLoading.main(10);////we can do method chaining as well

	}
     public static void main(int c) {
	System.out.println("bye");
	MainMethodOverLoading.main(c,40);
     
	}
     public static void main(int k,int j) {
 		int q=k+j;
 		System.out.println(q);
 				

 	}

}
