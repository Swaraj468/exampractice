package pojo;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;;
public class pojoamin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practicepojo obj = new practicepojo("9", "Swaraj", "Bandhu",
			"Punjab", 301, "Green Valley", 144411);
		obj.setMobile (12345, 823455, 7367390);
		
		Response response = given().contentType(ContentType.JSON).body(obj)
				.post("http://localhost:3000/soap");
		response.prettyPrint();
				
		

	}

}
