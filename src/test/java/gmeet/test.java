package gmeet;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class test {
	
	@Test
	public void test() {
		pojo obj = new pojo("3", "Mayur", "Rai", "India"
				, "Punjab", "djlas", "lawgate", 144411);
					obj.setMobile(1234455, 2331232, 43121);
					Response response = given().contentType(ContentType.JSON).body(obj).get("http://localhost:3000/Class");
					response.prettyPrint();
					int actual = response.statusCode();
					Assert.assertEquals(actual, 200);
					
	}
	@Test
	public void invalidtest() {
		pojo obj = new pojo("5", "Mayur", "Rai", "India"
				, "Punjab", "djlas", "lawgate", 144411);
					obj.setMobile(1234455, 2331232, 43121);
					Response response = given().contentType(ContentType.JSON).body(obj).get("http://localhost:3000/Class");
					response.prettyPrint();
					Assert.assertEquals(response.statusCode(), 200);
	}

}
