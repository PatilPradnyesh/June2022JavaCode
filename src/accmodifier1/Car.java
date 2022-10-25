package accmodifier1;

public class Car {
	
	public String ColourPublic;
	protected String ColourProtected;
	 String ColourDefault;
	private String ColourPrivate;
	
	public void getCpublic() {}
	
	void getCdefault() {}
	
	protected void getCprotected() {}
	
	private void getCprivate() {}

	public static void main(String[] args) {
		
		Car c =new Car();
		c.ColourDefault="black";
		c.ColourPrivate="Red";
		c.ColourProtected="white";
		c.ColourPublic="orange";
		
		c.getCdefault();
		c.getCprivate();
		c.getCprotected();
		c.getCpublic();
		
		

	}

}
