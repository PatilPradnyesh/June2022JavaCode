package dataconversion;

import java.util.Arrays;

public class DataCoversion {

	public static void main(String[] args) {
		
		//1) String to int
		//wrappper class of int is Integer
		String str = "100";
		System.out.println(str+20);
		int i = Integer.parseInt(str);//method toconvert string to int
		System.out.println(i+20);
		
		//2) String to double
		//wrapper of double is Double
		String mileage ="20.5";
		System.out.println(mileage +1.0);
		double d =Double.parseDouble(mileage);//method to convert string to double
		System.out.println(d+1.0);
		
		//3)String to boolean
		//wrapper of boolean is Boolean
		String headless ="true";
		
		//if(headless) {}
		boolean flag= Boolean.parseBoolean(headless);
		if(flag) {}
		
		//4)
		//int - string
		//double - string
		//boolean - string
		int i1 =10;
		System.out.println(i1+1);
		double d1=1.0;
		System.out.println(d1+1);
		boolean b1=true;
		if(b1) {}
		
		System.out.println(String.valueOf(i1)+1); //convert method String.valueof();
		System.out.println(String.valueOf(d1)+1.0);
		String s1=String.valueOf(b1);
		//if(s1) {};
		
		//split
		String top ="_java_python_ruby";
		String []arr= top.split("_");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		String empData ="Shubham;Patil;Shubham@gmail.com;18/7/99";
		String data[]=empData.split(";");
		
		for(String e:data) {
			System.out.println(e);
		}
		
		
		String space = "Java      Selenium        python";
		String ar1[]=space.split("\\s+");
		System.out.println(Arrays.toString(ar1));//when we have spit on space basis
		
		

	}

}
