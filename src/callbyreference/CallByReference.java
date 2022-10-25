package callbyreference;

public class CallByReference {
	String name;
	int age;
	//data type is classname 
	public void getInfo(CallByReference t) {
		t.name="tinu";
		t.age =25;
		sent(t);
	}
	
	public void sent(CallByReference t1) {
		t1.name="lalu";
		t1.age =27;
	}

	public static void main(String[] args) {
		
		CallByReference cbr =new CallByReference();
		cbr.name="SHubham";
		cbr.age=23;
		
		System.out.println(cbr.name + "    "+ cbr.age);
		cbr.getInfo(cbr);
		
		System.out.println(cbr.name + "    "+ cbr.age);

	}

}
