package pojo1;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class product {
	
	@Test
	public void TestRunner() {
		pojoclass obj = new pojoclass("2", "Mayur", "Rai", "India",
				"Punjab", "Green Valley", 301, 144411, "Lpu", "Engineering in Computer Science",
				"K21FZ", "API AUTOMATION", "Phagwara Punjab");
					obj.setMobile(123456,823510,7367083);
					
					Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/Watch");
					response.prettyPrint();
					int actual = response.statusCode();
					Assert.assertEquals(actual, 201);
	}
	@Test
	
	public void InvalidTestCase() {
		pojoclass obj = new pojoclass("2", "Mayur", "Rai", "India",
				"Punjab", "Green Valley", 301, 144411, "Lpu", "Engineering in Computer Science",
				"K21FZ", "API AUTOMATION", "Phagwara Punjab");
					obj.setMobile(123456,823510,7367083);
					
					Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/Watch");
					response.prettyPrint();
					Assert.assertEquals(response.statusCode(), 201);
	}

}
