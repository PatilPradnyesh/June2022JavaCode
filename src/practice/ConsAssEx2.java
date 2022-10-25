package practice;

import java.util.Arrays;

public class ConsAssEx2 {
	//ex 2
	private String brName;
	private double version;
	private String[]plugin;
	
	

	public ConsAssEx2(String brName, double version, String[] plugin) {
		this.brName = brName;
		this.version = version;
		this.plugin = plugin;
	}
	
	



	public String getBrName() {
		return brName;
	}





	public void setBrName(String brName) {
		this.brName = brName;
	}





	public double getVersion() {
		return version;
	}





	public void setVersion(double version) {
		this.version = version;
	}





	public String[] getPlugin() {
		return plugin;
	}





	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}





	public static void main(String[] args) {
		
		String [] plugList=new String[2];
		plugList[0]="Plugin1";
		plugList[1]="Plugin2";
		
		ConsAssEx2 ca =new ConsAssEx2("Chrome",1.2,plugList);
		
		System.out.println(ca.brName);
		System.out.println(ca.version);
		System.out.println(Arrays.toString(ca.getPlugin()));
		
		
		

	}

}
