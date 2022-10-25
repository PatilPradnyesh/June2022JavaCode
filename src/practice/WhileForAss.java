package practice;

public class WhileForAss {

	public static void main(String[] args) {
		for (int i=1;i<=9;i++) {
			System.out.println("I am batman"+" "+i);
		}
        System.out.println("----------------");	
        
        //3. WAP to print 10 to 1 using for, while and do-while loop
        for(int q=10;q>0;q--) {
        	System.out.println(q);
        }
        System.out.println("----------------");	
        int w=10;
        while(w>0) {
        	System.out.println(w);
        	w--;
        }
        System.out.println("----------------");	
        int e=10;
        do {
			System.out.println(e);
			e--;
		} while (e>0);
        System.out.println("----------------");	
        
        //4. Write a program in Java to print "Hello World" ten times using while loop
        String name="Hello World"	;
        int h=1;
        while(h<11) {
        	System.out.println(name);
        	h++;
        }
        System.out.println("----------------");	
        //7. print all odd and even numbers between 1 to 100
        
        for(int min=1;min<=100;min++) {
        	if(min%2==0) {
        		System.out.println(min);
        	}
        	else {
        		System.out.println("odd"+min);
        	}
        
        }
        System.out.println("----------------");	
        for(int min1=1;min1<=100;min1++) {
        	if(min1%2==0) {
        		System.out.println(min1++);
        		}
        	
        }
        System.out.println("----------------");	
        //9. Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console.
        for(char c='A';c<='Z';c++) {
        	System.out.println(c +" "+((int)c));
        }
        
        for(char d='a';d<='z';d++) {
        	System.out.println(d +" "+((int)d));
        }
        
        for(char x='0';x<='9';x++) {
        	System.out.println(x +" "+((int)x));
        }
        System.out.println("----------------");
        for(double i=1.0;i<=10.0;i++) {
        	System.out.println(i);
        }
        System.out.println("----------------");
        //11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
        for(int n=1;n<=10;n++) {
        	System.out.println(n);
        	if(n%7==0) {
        		System.out.println("bye, see you tomorrow");
        		break;
        	}
        	 
        	 
				
			}
        System.out.println("----------------");
        int score=25;
   	 switch (score) {
		case 0:
		{System.out.println("duck");}
			break;
		case 25:
		{System.out.println("gj ");}
			break;
		case 50:
		{System.out.println("half");}
			break;	
		default:
			break;
        }score++;
        
        
        }

}
