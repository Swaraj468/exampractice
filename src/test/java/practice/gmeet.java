package practice;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class gmeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", "2");
		map.put("Name", "Gmeet");
		map.put("Username", "Gmeet90");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(823510);
		arr.add(233444);
		arr.add(734343);
		map.put("Phone", arr);
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		map1.put("HouseNo", "301A");
		map1.put("StreetNo", "lawgate");
		map1.put("Pincode", 144411);
		map.put("Address", map1);
		Response response = given().contentType(ContentType.JSON).body(map)
				.post("http://localhost:3000/Class");
		response.prettyPrint();
		

	}

}
