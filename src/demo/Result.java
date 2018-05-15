package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import S1.S1Users;



public class Result {

	public static void main(String[] args)  {
		
		
		JSONParser parser = new JSONParser();
		ObjectMapper objectMapper = new ObjectMapper();
		
		try
		{
			BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\yudhe\\Documents\\Summer_Work_Eclipse_IDE\\Assignment\\src\\S1.json"));
			BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\yudhe\\Documents\\Summer_Work_Eclipse_IDE\\Assignment\\src\\S2.json"));
			JSONParser jsonParser = new JSONParser();
			 JSONObject s1 = (JSONObject) jsonParser.parse(br1);
		    JSONObject s2 = (JSONObject) jsonParser.parse(br2);
		    
		    ArrayList<S1Users> users = new ArrayList<S1Users>();
		    users = objectMapper.writeValueAsString(s1.get("data"));
		    
		    System.out.println(s1.get("data"));
			
		    System.out.println(s2); 
		    
		  
		    	
		    
       		    
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
