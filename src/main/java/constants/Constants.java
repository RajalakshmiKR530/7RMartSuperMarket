package constants;
//Your Constants.java is just a utility class where you keep fixed, reusable values (like error messages, file paths, URLs, expected messages, etc.
public class Constants 
{
	//means the value is constant (cannot be changed)
	
	public static final String ERRORMESSAGEFORLOGIN ="Homepage is not loaded";
	public static final String ERRORMESSAGEFORLOGININCORRECTUSERNAMEANDPASSWORD ="Alert is not displayed";
	public static final String ERRORMESSAGEFORLOGININCORRECTUSERNAMEANDCORRECTPASSWORD ="Alert is not displayed";
	public static final String ERRORMESSAGEFORLOGINCORRECTUSERNAMEANDINCORRECTPASSWORD ="Alert is not displayed";
	
	public static final String FILEPATH = System.getProperty("user.dir")+"//src/main//resources//TestData.xlsx";
	
	public static final String IMAGEPATH = System.getProperty("user.dir")+"//src/main/resources//TestPNG.png";
	
}
