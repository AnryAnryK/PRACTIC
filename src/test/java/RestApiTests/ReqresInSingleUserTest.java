package RestApiTests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;


public class ReqresInSingleUserTest {
///	String data ="{id: 2,\n" +
//			"email: \"janet.weaver@reqres.in\",\n" +
//			"first_name: \"Janet\",\n" +
//			"last_name: \"Weaver\"}";

	@Test
	void SingleUserApiSucessfullTest(){
		get("https://reqres.in/api/users/2")
		.then()
				.statusCode(200)
				.body("data.id", is(2))
				.body("data.email", is("janet.weaver@reqres.in"))
				.body("data.first_name", is("Janet"))
				.body("data.last_name", is("Weaver"));

	}
}
