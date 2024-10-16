package RestApiTests;

import RestApiTests.ReqresInSingleUserLombokModelTest.LombokDataBase;
import RestApiTests.ReqresInSingleUserLombokModelTest.LombokResponse;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class ReqresInSingleUserTest {
///	String data ="{ data: { id: 2, email: "janet.weaver@reqres.in", first_name: "Janet", last_name: "Weaver", avatar: "https://reqres.in/img/faces/2-image.jpg" }, support: { url: "https://reqres.in/#support-heading", text: "To keep ReqRes free, contributions towards server costs are appreciated!" } }";

	@Test
	void SingleUserApiWhithGivenGETResponseSucessfullTest(){
		given()
				.when()
				.get("https://reqres.in/api/users/2")
				.then()
				.statusCode(200)
				.body("data.id", is(2))
				.body("data.email", is("janet.weaver@reqres.in"))
				.body("data.first_name", is("Janet"))
				.body("data.last_name", is("Weaver"));

	}
	@Test
	void SingleUserApiWhithGivenAndLogsGETResponseBestPracticeSuccessfulTest(){
		Integer expectedID = 2;
		Integer actualID =
		given()
				.log().all()
				.when()
				.get("https://reqres.in/api/users/2")
				.then()
				.log().all()
				.statusCode(200)
				.body("data.id", is(expectedID))
				.body("data.email", is("janet.weaver@reqres.in"))
				.body("data.first_name", is("Janet"))
				.body("data.last_name", is("Weaver"))
				.extract().path("data.id");
				assertEquals(expectedID, actualID);

	}
	@Test
	void SingleUserApiWhithGivenAndLogsPOSTResponseBestPracticeSuccessfulTest(){

		String data = "{ \"email\": \"eve.holt@reqres.in\", \"password\": \"cityslicka\" }";
				given()
						.log().all()
						.contentType(ContentType.JSON)
						.body(data)
						.when()
						.post("https://reqres.in/api/login")
						.then()
						.log().all()
						.statusCode(200)
						.body("token", is("QpwL5tke4Pnpja7X4"));
	}

	@Test
	void SingleUserApiWhithGivenAndLogsLombokModelPOSTResponseBestPracticeSuccessfulTest (){
		LombokDataBase LombokModel = new LombokDataBase();
		LombokModel.setEmail ("eve.holt@reqres.in");
		LombokModel.setPassword("cityslicka");
		LombokModel.setFirstName("Janet");
		LombokModel.setLastName("Weaver");

		LombokResponse lombokResponse =
		given()
				.log().all()
				.contentType(ContentType.JSON)
				.body(LombokModel)
				.when()
				.post("https://reqres.in/api/login")
				.then()
				.log().all()
				.statusCode(200)
				.extract().as(LombokResponse.class);
		assertThat(lombokResponse.getToken()).isEqualTo("QpwL5tke4Pnpja7X4");

	}
}
