package gmeet;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class pojomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pojo obj = new pojo("3", "Mayur", "Rai", "India"
	, "Punjab", "djlas", "lawgate", 144411);
		obj.setMobile(1234455, 2331232, 43121);
		Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/Class");
		response.prettyPrint();

	}

}
