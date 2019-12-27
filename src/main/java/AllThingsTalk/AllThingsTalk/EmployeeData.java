package AllThingsTalk.AllThingsTalk;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeData {
	
	@JsonProperty("name")
	public String name; 
	
	@JsonProperty("email")
	public String email; 
	
	@JsonProperty("birthday")
	public String birthday; 	
	
	public static EmployeeData get(String filename) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(new File(filename), EmployeeData.class); 
	}


}
