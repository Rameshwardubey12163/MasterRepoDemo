package restAssuredpakage;
import org.testng.annotations.Test; 

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HttpReq {


	
	int id;
	
	
	@Test(priority=1)
	public void Getrequest() {
		given()
		.when()
		   .get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("page", equalTo(2))
		.log().all();
		
	}
	
	@Test(priority=2)
	public void postRequest() {
		HashMap hm= new HashMap();
		hm.put("name", "dubey");
		hm.put("job", "engineer");
		id=given()
		     .contentType(ContentType.JSON)
		     .body(hm)
		.when()
		      .post("https://reqres.in/api/users")
		      .jsonPath().getInt("id");
		//.then()
		     // .statusCode(201)
		     // .log().all();
		
	}
	
	@Test(priority=3)
	public void UpdatRequest() {
		HashMap body= new HashMap();
		body.put("name", "ram");
		body.put("job", "software engineer");
		given()
		     .contentType(ContentType.JSON)
		     .body(body)
		.when()
		      .put("https://reqres.in/api/users/"+ id)
		.then()
		     .statusCode(200)
		      .log().all();
		
	}
	@Test(priority=4)
	public void deletuser() {
		given()
		.when()
		 .delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
		.log().all();
	}

}
