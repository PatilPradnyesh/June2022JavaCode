package oop_encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1= new Employee("Shubham",29,true);
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.isPerm());
		e1.setName("Mahesh");//updating value //setter used to modify value
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.isPerm());
		
		

	}

}
