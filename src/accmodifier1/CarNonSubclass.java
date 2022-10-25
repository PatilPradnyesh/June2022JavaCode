package accmodifier1;

public class CarNonSubclass {

	public static void main(String[] args) {
		
		Car c =new Car();
		
		c.ColourDefault="black";
		//c.ColourPrivate="Red"; no
		c.ColourProtected="white";
		c.ColourPublic="orange";
		
		c.getCdefault();
		//c.getCprivate(); no
		c.getCprotected();
		c.getCpublic();

	}

}
