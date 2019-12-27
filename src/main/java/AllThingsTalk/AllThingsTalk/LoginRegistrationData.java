package AllThingsTalk.AllThingsTalk;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LoginRegistrationData {
	
	@JsonProperty("emailBlank")
	public String emailBlank; 
	
	@JsonProperty("newEmail")
	public String newEmail; 
	
	@JsonProperty("sameEmail")
	public String sameEmail; 
	
	@JsonProperty("invalidEmail")
	public String invalidEmail; 
	
	@JsonProperty("usernameBlanck")
	public String usernameBlanck; 
	
	@JsonProperty("sameUsername")
	public String sameUsername; 
		
	@JsonProperty("newUsername")
	public String newUsername; 
	
	@JsonProperty("username")
	public String username; 
	
	@JsonProperty("passwordBlanck")
	public String passwordBlanck; 
		
	@JsonProperty("samePassword")
	public String samePassword; 
	
	@JsonProperty("newPassword")
	public String newPassword; 
	
	@JsonProperty("invalidPassword")
	public String invalidPassword; 
	

	@JsonProperty("password")
	public String password; 
	
	public static LoginRegistrationData get(String filename) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(new File(filename), LoginRegistrationData.class); 
	}


}
