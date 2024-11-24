package practice;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = given().contentType(ContentType.JSON)
				.body(" {\r\n"
						+ "      \"id\": \"4\",\r\n"
						+ "      \"Username\": \"swarajeo\",\r\n"
						+ "      \"Phone number\": \"8235107591\",\r\n"
						+ "      \"Name\": \"gupta\"\r\n"
						+ "    }").post("http://localhost:3000/soap");
		response.prettyPrint();

	}

}
