package accmodifier2;

import accmodifier1.Car;

public class CarDifferentpSubclass extends Car {

	public static void main(String[] args) {
		
		CarDifferentpSubclass c =new CarDifferentpSubclass();
		
		//c.ColourDefault="black"; no
		//c.ColourPrivate="Red"; no
		c.ColourProtected="white";
		c.ColourPublic="orange";
		
		//c.getCdefault(); no
		//c.getCprivate(); no
		c.getCprotected();
		c.getCpublic();

	}

}
