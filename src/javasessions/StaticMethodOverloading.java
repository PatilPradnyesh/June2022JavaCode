package javasessions;

public class StaticMethodOverloading {

	public static void printLogo(int i) {
		StaticMethodOverloading.printLogo(i,30);
	}

	public static void printLogo(int k, int l) {
        int j=k+l;
        System.out.println(j);
	}

	public static String printLogo(String name) {
          return name+ "logo";
	}

	public static void main(String[] args) {
		StaticMethodOverloading.printLogo(30);//we can do method chaining as well
		
	}

}
