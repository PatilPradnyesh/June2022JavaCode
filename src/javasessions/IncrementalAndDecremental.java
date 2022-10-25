package javasessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		//1)post incremental
		int a = -99;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int total = 3;
		System.out.println(total++);
		System.out.println(total);
		
		//2)pre incremental
		int d = 3;
		int e =++d;
		System.out.println(d);
		System.out.println(e);
		
		int pop = 67;
		System.out.println(++pop);
		System.out.println(pop);
		
		//3)post decremental
		int j= -89;
		int k= j--;
		System.out.println(j);
		System.out.println(k);
		
		int food = -5;
		System.out.println(food--);
		System.out.println(food);
		
		//4)pre decremental
		int l= -89;
		int f= --l;
		System.out.println(l);
		System.out.println(f);
		
		int food1 = -5;
		System.out.println(--food1);
		System.out.println(food1);
		
		int x =10;
		int s =++x + x++ + x--;
		System.out.println(x);
		System.out.println(s);
	}

}
