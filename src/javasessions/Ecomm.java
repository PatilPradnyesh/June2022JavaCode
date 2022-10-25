package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Ecomm {

	public double sum(double d1, double d2) {
		System.out.println("the sum of the number is :");
		double total = d1 + d2;
		return total;
	}

	// WAF:get deviceslist
	// input empname
	// return deviceslist

	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("Getting Deivces list:" + empName);
		ArrayList<String> devicesList = new ArrayList<String>();
		if (empName.equalsIgnoreCase("Shubham")) {
			devicesList.add("Iphone ");
			devicesList.add("Mac ");
			devicesList.add("Bag ");

		} else if (empName.equalsIgnoreCase("Mahesh")) {
			devicesList.add("Iphone 45 ");
			devicesList.add("Mac book");
			devicesList.add("Bag pen");

		} else if (empName.equalsIgnoreCase("Pranav")) {
			devicesList.add("Iphone 43 ");
			devicesList.add("Mac book drive");
			devicesList.add("Bag pen");

		} else {
			System.out.println("Name not found .........." + empName);
		}
		return devicesList;

	}

	// waf to get subjectlist static array
	// input studentname
	// msx sub is 5 and return sublist

	public String getSubList(String stdName) {
		System.out.println("Getting subject list :"+stdName);
		
		String subList []=new String [5];
		
		if(stdName.equalsIgnoreCase("Lavanya")) {
		subList[0]="Maths";
		subList[1]="History";
		subList[2]="Science";
		subList[3]="Geography";
		subList[4]="Marathi";
		}
		else if(stdName.equalsIgnoreCase("Prayag")) {
			subList[0]="Maths 1";
			subList[1]="History 3";
			subList[2]="Science 3";
			subList[3]="Geography";
			subList[4]="Marathi";
			}
		
		else {
			System.out.println("pLease pass right "+stdName);
		}
		return Arrays.toString(subList);
		
     
	}

	public static void main(String[] args) {
		Ecomm obj = new Ecomm();
		double total = obj.sum(12.45, 45.45);//call by value
		System.out.println(total);

		ArrayList<String> l1 = obj.getDevicesList("praNav");
		System.out.println(l1);
		System.out.println(l1.size());
		
		String l2= obj.getSubList("praya");
		System.out.println(l2);

	}

}
