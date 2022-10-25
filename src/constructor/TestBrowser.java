package constructor;

public class TestBrowser {

	public static void main(String[] args) {
		Browser b = new Browser("Google",1.3,"goog1");
		System.out.println(b.getName()+ " "+ b.getPlugin()+ " "+ b.geVersion());
		
		b.setName("opera");
		b.setPlugin("op1");
		b.setVersion(56.6);
		System.out.println(b.getName()+ " "+ b.getPlugin()+ " "+ b.geVersion());
		

	}

}
