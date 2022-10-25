package method;

public class gradeOfStudents {
	
	public String getGrades(int marks) {
		if(marks<=100&&marks>=91) {
			return "AA";
		}
		else if(marks<=90&&marks>=81) {
			return "AB";
		}
		else if(marks<=80&&marks>=71) {
			return "BB";
		}
		else if(marks<=70&&marks>=61) {
			return "BC";
		}
		else if(marks<=60&&marks>=51) {
			return "CD";
		}
		else if(marks<=50&&marks>=41) {
			return "DD";
		}
		else if(marks<=40&&marks>=0) {
			return "Fail";
		}
		else {
			return "Please Enter valid marks";
		}
	}
		

	public static void main(String[] args) {
		
		gradeOfStudents gos =new gradeOfStudents();
		System.out.println(gos.getGrades(61));
		

	}

}
