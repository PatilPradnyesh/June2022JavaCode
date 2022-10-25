package accmodifier2;

import accmodifier1.Car;

public class CarDifferPackagNonSubClass {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		//c.ColourDefault="black"; no
		//c.ColourPrivate="Red"; no
		//c.ColourProtected="white"; no
		c.ColourPublic="orange";
		
		//c.getCdefault(); no
		//c.getCprivate(); no
		//c.getCprotected(); no
		c.getCpublic();

	}

}
