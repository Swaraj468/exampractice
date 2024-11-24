package practice;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class handelingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", "6");
		map.put("Name", "Swaraj");
		map.put("Username", "Swaraj09");
		map.put("Phone Number", 1235466);
		Response response = given().contentType(ContentType.JSON).body(map)
				.post("http://localhost:3000/soap");
		response.prettyPrint();

	}

}
