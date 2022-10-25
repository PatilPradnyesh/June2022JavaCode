package javasessions;

public class ApplicationSystems {
	
	String appname;
	int pages;
	String url;
	
	public ApplicationSystems(String name,int page, String url) {
		
		this.appname=name;
		this.pages=page;
		this.url=url;
		
	}
	
	public int getPageCount(String name) {
		switch (name) {
		case "amazon":
			return pages;
			
		case "flipkart":
			return pages;	
			
		default:
			return -1;
		}
	}

	

}
