package oop_encapsulation;

public class Browser {

	public void launchBrowser() {
       System.out.println("launchBrowser");
       checkBroswserVersion();
       checkOscomptible();
       enoughramSpace();
       updateNeeded();
	}

	private void checkBroswserVersion() {
		System.out.println("lheckBroswserVersionr");
	}

	private void checkOscomptible() {
		System.out.println("checkOscomptibler");
	}

	private void enoughramSpace() {
		System.out.println("noughramSpace(r");
	}

	private void updateNeeded() {
		System.out.println("updateNeeded");
	}

}
