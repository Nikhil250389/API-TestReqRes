package utility;

public class Resources {
	
	public String getAddResource() {
		String resource ="maps/api/place/add/json/";
		return resource;
		
	}
	public String getDeleteResource() {
		String resource ="maps/api/place/delete/json/";
		return resource;
		
	}
	public String createJiraSessionRes() {
		String SessionResource="/rest/auth/1/session";
		return SessionResource;
		
	}
	public String createJiraIssueRes() {
		String SessionResource="/rest/api/2/issue";
		return SessionResource;
		
	}
	public String addComment(String issueid) {
		String SessionResource="/rest/api/2/issue/"+issueid+"/comment";
		return SessionResource;
		
	}

}
