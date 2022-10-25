package exception_handling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		//throwable is master class of Exception and Error
		//exception has no. of classes
		//we can have multiple catch block for multiple exception handling
		//Only exception can handle all the exceptions but mentionong specific name is good practice
		
		
		System.out.println("AAAAAA");
		int a=9;
		int b=3;
		
		try {
			int i =a/b; 
			
			String obj =new String("Naveen");
			obj=null;
			System.out.println(obj.charAt(0));
						
			}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming");
		}
		
		System.out.println("Bye");

	}

}
