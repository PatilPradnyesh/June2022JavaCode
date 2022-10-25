package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//while
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		int k=1;
		while(k<=100) {
			System.out.println(k);
			if(k%5==0) {
				System.out.println("hi");
			}
			if(k==30) {
				System.out.println("thirty");
			}
			k++;
		}
       
		//for loop
		for( i=1;i<10;i++) {
			System.out.println("hi");
			break;
		}
		
		for(char c='a';c<='z';c++) {
			System.out.println(c + " -"+((int)c));
		}
	}

}
