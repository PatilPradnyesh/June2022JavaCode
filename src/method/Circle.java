package method;

public class Circle {
	
	public double areaOfCircle(int radius) {
		double area = (3.14)*(radius*radius);
		return area;
		
	}
	
	public double circumferenceOfCircle(int radius) {
		double  circumference= (2)*(3.14)*(radius);
		return circumference;
		
	}

	public static void main(String[] args) {
		
		Circle c=new Circle();
		
		System.out.println(c.areaOfCircle(15));
		System.out.println(c.circumferenceOfCircle(2));
		

	}

}
