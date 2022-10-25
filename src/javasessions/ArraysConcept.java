package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {
		//using new keyword
		
        int i[]=new int[4];	
        i[0]=1;
        i[1]=2;
        i[2]=3;
        i[3]=4;
        int len = i.length;
        int hig=len-1;
        int low =0;
        
        for(int k=0;k<len;k++) {
        	System.out.println(i[k]);
        }
        System.out.println("--------");
        //reverse
        for(int c=len-1;c>=0;c--) {
        	System.out.println(i[c]);
        }
        
        
        //double array
        double d[]=new double[2];
        d[0]=1.2;
        d[1]=2.4;
        System.out.println(d[0]);
        for(double e:d) {
        	System.out.println(e);
        }
        System.out.println("------------");
        
        //char 
        char c[]=new char[1];
        c[0]='v';
        System.out.println(c[0]);
        for(double e:c) {
        	System.out.println(c);
	}
	}

}
