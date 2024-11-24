package practice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = given().contentType(ContentType.JSON)
				.body("{\r\n"
						+ "      \"id\": \"4\",\r\n"
						+ "      \"Username\": \"swarajeo\",\r\n"
						+ "      \"Phone number\": \"8235107\",\r\n"
						+ "      \"Name\": \"gupta\"\r\n"
						+ "    }").put("http://localhost:3000/soap/4");
		response.prettyPrint();

	}

}
