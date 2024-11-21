package API;

import RestApiTests.ReqresInSingleUserLombokModelTest.LombokDataBase;
import RestApiTests.ReqresInSingleUserLombokModelTest.LombokResponse;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.get;
import static org.assertj.core.api.BDDAssumptions.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.restassured.RestAssured.given;



public class DemoqaComSwaggerTest {

	@Test

// УСПЕШНО
	void DemoqaComSwaggerGETTest() {
		String expectedEmail = "janet.weaver@reqres.in";
		String actualEmail =
			given()
						.log().all()
						.when()
						.get("https://reqres.in/api/users/2")
						.then()
						.body("data.id", is(2))
						.body("data.email", is(expectedEmail))
						.log().all()
						.statusCode(200)
						.extract().path("data.email");
		assertEquals(expectedEmail, actualEmail);

	}

	@Test
		// НЕ УСПЕШНО
	void DemoqaComSwaggerGETLombokTest() {
		LombokDataBase LombokModel = new LombokDataBase();
		LombokModel.setEmail("janet.weaver@reqres.in");

		LombokResponse lombokResponse =
				(LombokResponse) given()
						.log().all()
						.contentType(ContentType.JSON)
						.body(LombokModel)
						.when()
						.get("https://reqres.in/api/users/2")
						.then()
						.body("data.id", is(2))
						.log().all()
						.statusCode(200)
//						.body("support.text", is("To keep ReqRes free, contributions towards server costs are appreciated!"));
						.body("support.text", is("Tired of writing endless social media content? Let Content Caddy generate it for you"));
//						.extract().as(LombokResponse.class);
//		assertThat("support.text").isEqualTo("To keep ReqRes free, contributions towards server costs are appreciated!");
//		assertThat("support.text").isEqualTo("Tired of writing endless social media content? Let Content Caddy generate it for you");

	}

	@Test
	void ReqresInTest2Successful() {
		given()
				.log().all()
				.when()
				.get("https://reqres.in/api/users/2")
				.then()
				.statusCode(200);
	}



}
