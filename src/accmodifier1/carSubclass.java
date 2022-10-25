package accmodifier1;

public class carSubclass extends Car {

	public static void main(String[] args) {
		
		carSubclass c =new carSubclass();
		
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
