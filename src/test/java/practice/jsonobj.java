package practice;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;


import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class jsonobj {
	
	public static void main(String[] args) {
		JSONObject jobj = new JSONObject();
		jobj.put("id", "3");
		JSONObject name = new JSONObject();
		name.put("FirstName", "Gmeet");
		name.put("SecondName", "Singh");
		jobj.put("Name", name);
		ArrayList<Integer> phone = new ArrayList<Integer>();
		phone.add(123455);
		phone.add(33423423);
		jobj.put("Phone", phone);
		JSONObject addre = new JSONObject();
		addre.put("HouseNo", "301a");
		addre.put("StreetNo", "41da");
		addre.put("Pincode", 123322);
		jobj.put("Address", addre);
		
		Response response = given().contentType(ContentType.JSON).body(jobj.toString())
				.post("http://localhost:3000/Class");
		response.prettyPrint();
		
		
	}

	

}
