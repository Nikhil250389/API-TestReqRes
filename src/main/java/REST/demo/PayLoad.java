package REST.demo;

public class PayLoad {
	 
	public String getPostData() {
		String bd="{\r\n" + 
				"    \"location\":{\r\n" + 
				"        \"lat\" : -38.383494,\r\n" + 
				"        \"lng\" : 33.427362\r\n" + 
				"    },\r\n" + 
				"    \"accuracy\":50,\r\n" + 
				"    \"name\":\"Frontline Border house\",\r\n" + 
				"    \"phone_number\":\"(+91) 999 893 3937\",\r\n" + 
				"    \"address\" : \"29, side layout, cohen 09\",\r\n" + 
				"    \"types\": [\"shoe park\",\"shop\"],\r\n" + 
				"    \"website\" : \"http://google.com\",\r\n" + 
				"    \"language\" : \"French-IN\",\r\n" + 
				"    \"Country\" :\"India\"\r\n" + 
				"}";
				
				/*
				 * Also right format
		String bd = "{" +
	            "\"location\":{" +
	            "\"lat\" : -38.383494," +
	            "\"lng\" : 33.427362" +
	            "}," +
	            "\"accuracy\":50," +
	            "\"name\":\"Frontline house\"," +
	            "\"phone_number\":\"(+91) 983 893 3937\"," +
	            "\"address\" : \"29, side layout, cohen 09\"," +
	            "\"types\": [\"shoe park\",\"shop\"]," +
	            "\"website\" : \"http://google.com\"," +
	            "\"language\" : \"French-IN\"" +
	            "}";
	            */
		return bd;
	}
	
	// This method is use to handle the dynamic payload to add the new book in 
	public String addBookPayLoad(String isbn, String asle ) {
		String pLoad= "{\r\n" + 
						"\r\n" + 
						"\"name\":\"Learn Appium Automation with Java\",\r\n" + 
						"\"isbn\":\""+isbn+"\",\r\n" + 
						"\"aisle\":\""+asle+"\",\r\n" + 
						"\"author\":\"John foe\"\r\n" + 
						"}\r\n" + 
						" \r\n" + 
						"";
		return pLoad;
		
	}
	
	//create jira issue
	public String createIssuePayLoad() {
		String b= "{\r\n" + 
				"	\"fields\": {\r\n" + 
				"        \"project\":\r\n" + 
				"        {\r\n" + 
				"            \"key\": \"RAT\"\r\n" + 
				"        },\r\n" + 
				"        \"summary\": \"Issue create from the Rest Assured Automation\",\r\n" + 
				"        \"description\":\"acception invalid no in Debit card portal\",\r\n" + 
				"        \"issuetype\": {\r\n" + 
				"            \"name\": \"Bug\"\r\n" + 
				"        }\r\n" + 
				"}\r\n" + 
				"}";
		return b;
		
	}
	public String addCommentPayLoad() {
		String b="{\r\n" + 
				"    \"body\": \"HI @ RRY ok we will check it is working fine or not \",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}";
		
		return b;
	}
	
	public String registerUserBody() {
		
		String bd="{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"pistol\"\r\n" + 
				"}";
		return bd;
	}
	
	public String loginBody() {
		String lb="{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}";
		return lb;
	}
	
	public String createUserBody(Object object) {
		String userB="{\r\n" + 
				"    \"name\": \""+object+"\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
		
		return userB;
	}
	public String updateUserBody(Object object) {
		String userB="{\r\n" + 
				"    \"name\": \""+object+"\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
		
		return userB;
	}
	
	
	

}
