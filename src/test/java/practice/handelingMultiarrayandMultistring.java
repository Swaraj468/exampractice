package practice;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class handelingMultiarrayandMultistring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", "7");
		map.put("Name", "Tanishq");
		map.put("Username", "Tanishq09");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(82351075);
        arr.add(73670853);
        map.put("Phone Number", arr);
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        map1.put("House No", "301A");
        map1.put("Street Name", "Green Valley");
        map1.put("Pincode", 144411);
        map.put("address", map1);
        
        Response response = given().contentType(ContentType.JSON).body(map)
        		.post("http://localhost:3000/soap");
        response.prettyPrint();
        
        
	}

}
