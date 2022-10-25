package oop_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Br {
	
	private String brName;
	private double version;
	private ArrayList<String>plugin;
	private String page[];
	
	public Br(String brName, double version, ArrayList<String> plugin,String[] page) {
		this.brName = brName;
		this.version = version;
		this.plugin = plugin;
		this.page=page;
	
	}
	public String[] getPage() {
		return page;
	}
	public void setPage(String[] page) {
		this.page = page;
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
	public ArrayList<String> getPlugin() {
		return plugin;
	}
	public void setPlugin(ArrayList<String> plugin) {
		this.plugin = plugin;
	}
	
	public static void main(String[]args) {
		ArrayList<String>plug=new ArrayList<String>();
		plug.add("Spell Check");
		plug.add("SPedd");
		
		String pag []=new String[3];
		pag[0]="one";
		pag[1]="two";
		
		Br obj=new Br("Chrome",1.3,plug,pag);
		System.out.println(obj.getPlugin());
		System.out.println(obj.getPlugin().size());
		System.out.println(Arrays.toString(obj.getPage()));
		System.out.println(obj.getPage().length);
		
		plug.add("Shubham");
		pag[2]="tinu";
		
		System.out.println(obj.getPlugin());
		System.out.println(obj.getPlugin().size());
		System.out.println(Arrays.toString(obj.getPage()));
		System.out.println(obj.getPage().length);
		
		
		
	}

}

