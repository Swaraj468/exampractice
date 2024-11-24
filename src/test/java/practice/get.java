package practice;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = given().contentType(ContentType.JSON).get("http://localhost:3000/soap");
		response.prettyPrint();

	}

}
