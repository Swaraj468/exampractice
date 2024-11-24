package practice;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.ArrayList;

import org.json.JSONObject;

public class jsonobjecthandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jobj = new JSONObject();
		jobj.put("id", "8");
		JSONObject name = new JSONObject();
		name.put("First Name", "Avneesh");
		name.put("Last Name", "Lohan");
		jobj.put("Name", name);
		JSONObject addre = new JSONObject();
		addre.put("House No", 301);
		addre.put("Street Name", "Green Valley");
		addre.put("Pincode", 144411);
		jobj.put("Address", addre);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(7895943);
		arr.add(1234455);
		jobj.put("Phone Number", arr);
		JSONObject Uni = new JSONObject();
		Uni.put("Univeristy Name", "Lovely Professional University");
		Uni.put("Degree", "BTech in computer science");
		Uni.put("Course", "Computer Science Engineering");
		Uni.put("Subject", "Api Testing");
		jobj.put("University Details", Uni);
		
		Response response = given().contentType(ContentType.JSON)
				.body(jobj.toString()).post("http://localhost:3000/soap");
		response.prettyPrint();

	}

}
