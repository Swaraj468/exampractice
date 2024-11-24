package practice;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class puthashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
//		HashMap<String, Integer> ob = new HashMap<String, Integer>();
		map.put("id", "5");
		map.put("Name", "Avdesh");
		map.put("Phone Number", "123344");
		
		Response response = given().contentType(ContentType.JSON).body(map)
				.put("http://localhost:3000/soap/5");

		response.prettyPrint();
	}

}
