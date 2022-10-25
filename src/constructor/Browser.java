package constructor;

public class Browser {
	
	private String name;
	private double version;
	private String plugin;
	
	public Browser(String name,double version ,String plugin ) {
		this.name=name;
		this.version=version;
		this.plugin=plugin;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPlugin(String plugin) {
		this.plugin=plugin;
	}
	
	public String getPlugin() {
		return plugin;
	}
	
	public void setVersion(double version) {
		this.version=version;
	}
	
	public double geVersion() {
		return version;
	}
	

}
