package practice;

import java.util.ArrayList;

public class CnstructorAssignment {
	
	//example 1st
	
	String name;
	String country;
	String establishedDate;
	ArrayList <String>course;
	
	CnstructorAssignment(String name,String country,String establishedDate,ArrayList <String>course){
		this.name=name;
		this.country=country;
		this.establishedDate=establishedDate;
		this.course=course;
		
	}
	
	public CnstructorAssignment(String name) {
		this.name = name;
	}
	
	public CnstructorAssignment(ArrayList<String> course) {
		
		this.course = course;
	}
	
	public ArrayList <String> getCourse(){
		return course;
	}
	
    public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public static void main(String[] args) {
		
		ArrayList<String>courseList=new ArrayList<String>();
		courseList.add("Mechanical");
		courseList.add("Electrical");
		
		
		CnstructorAssignment ca =new CnstructorAssignment(courseList);
		System.out.println(ca.getCourse());
		
		
		

	}

}
