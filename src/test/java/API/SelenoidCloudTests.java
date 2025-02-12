package API;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelenoidCloudTests {

	/* 1. Start the https://selenoid.autotests.cloud/#/    (CAPABILITIES -> Java -> choose the Chrome Version)

	 * 2. Get request to https://selenoid.autotests.cloud/status

	 * 3. Get response: { total: 20, used: 1, queued: 0, pending: 0,
	 * browsers: { chrome: { 100.0: { }, 113.0: { }, 114.0: { }, 120.0: { }, 121.0: { }, 122.0: { }, 123.0: { }, 124.0: { }, 125.0: { }, 126.0:
	 * { user1: { count: 1, sessions: [
	 * { id: "5617c7ea924e2583f00d95d69a00baa1",
	 * container: "51b1568c9a3798671e5bc571e13d290424393b28a08cf24890b6fe906d98465f",
	 * containerInfo: {
	 * id: "51b1568c9a3798671e5bc571e13d290424393b28a08cf24890b6fe906d98465f",
	 * ip: "172.18.0.4" }, vnc: true, screen: "1920x1080x24",
	 * caps: { browserName: "chrome",
	 * version: "126.0",
	 * screenResolution: "1920x1080x24",
	 * enableVNC: true,
	 * videoScreenSize: "1920x1080",
	 * name: "Manual session",
	 * labels: { manual: "true" },
	 * sessionTimeout: "60m" },
	 * started: "2025-02-12T07:12:20.447982074Z" } ] } },
	 * 99.0: { } },
	 * firefox: { 122.0: { }, 123.0: { }, 124.0: { }, 125.0: { } },
	 * opera: { 106.0: { }, 107.0: { }, 108.0: { }, 109.0: { } },
	 * playwright-chromium: { 1.28.1: { } } } }

	 * 4. Assert that { total: 20 }

	 * */

	@Test
		// ТЕСТ УСПЕШНЫЙ !!!
	void checkTotalCloudTest() {
		given()
				.log().all()
				.contentType(JSON)
				.when()
				.get("https://selenoid.autotests.cloud/status")
				.then()
				.body("total", is(20))
				.body("used", is(1))
				.body("browsers.chrome", hasKey("126.0"))
				.statusCode(200)
				.log().status()
				.log().body();
	}

	@Test
		// ТЕСТ УСПЕШНЫЙ !!!
	void checkTotalCloudTestWithString() {

		String expectedResponse = "{\"total\":20,\"used\":1,\"queued\":0,\"pending\":0,\"browsers\":" +
				"{\"chrome\":{\"100.0\":{},\"113.0\":{},\"114.0\":{},\"120.0\":{},\"121.0\":{},\"122.0\":{},\"123.0\":{},\"124.0\":{},\"125.0\":{},\"126.0\":" +
				"{\"user1\":{\"count\":1,\"sessions\":[{\"id\":\"a58268f45390c00087b8ed2a8dbb07c3\"," +
				"\"container\":\"6eb306e44ee1ecdf57658c419a9a81f89f100ce0e7faa4441c2f39e01e3fa7e7\"," +
				"\"containerInfo\":{\"id\":\"6eb306e44ee1ecdf57658c419a9a81f89f100ce0e7faa4441c2f39e01e3fa7e7\"," +
				"\"ip\":\"172.18.0.4\"},\"vnc\":true,\"screen\":\"1920x1080x24\",\"caps\":" +
				"{\"browserName\":\"chrome\",\"version\":\"126.0\",\"screenResolution\":\"1920x1080x24\",\"enableVNC\":true," +
				"\"videoScreenSize\":\"1920x1080\",\"name\":\"Manual session\",\"labels\":{\"manual\":\"true\"},\"sessionTimeout\":\"60m\"}," +
				"\"started\":\"2025-02-12T09:28:03.805726796Z\"}]}},\"99.0\":{}}," +
				"\"firefox\":{\"122.0\":{},\"123.0\":{},\"124.0\":{},\"125.0\":{}}," +
				"\"opera\":{\"106.0\":{},\"107.0\":{},\"108.0\":{},\"109.0\":{}}," +
				"\"playwright-chromium\":{\"1.28.1\":{}}}}\n";

		Response actualResponse = given()
				.log().all()
				.contentType(JSON)
				.when()
				.get("https://selenoid.autotests.cloud/status")
				.then()
				.body("total", is(20))
				.body("used", is(1))
				.body("browsers.chrome", hasKey("126.0"))
				.statusCode(200)
				.log().status()
				.log().body()
				.extract().response();

		assertEquals(expectedResponse, actualResponse.asString());
	}

	@Test
		// ТЕСТ УСПЕШНЫЙ !!!
	void checkTotalCloudTestWithStringGoodPractic() {

		Integer expectedResponseTotal = 20;

		Integer actualResponseTotal = given()
				.log().all()
				.contentType(JSON)
				.when()
				.get("https://selenoid.autotests.cloud/status")
				.then()
				.body("total", is(20))
				.body("used", is(1))
				.body("browsers.chrome", hasKey("126.0"))
				.statusCode(200)
				.log().status()
				.log().body()
				.extract().path("total");

		assertEquals(expectedResponseTotal, actualResponseTotal);
	}

	@Test
		// ТЕСТ УСПЕШНЫЙ !!!
	void checkTotalCloudTestWithStringGoodHubStatus200() {

//		String expectedResponseMessage = "{ value: { message: \"Selenoid 1.11.3 built at 2024-05-25_12:34:40PM\", ready: true } }";

		given()
				.log().all()
//				.auth().basic("user1", "1234") // так удобнее
				.contentType(JSON)
				.when()
				.get("https://user1:1234@selenoid.autotests.cloud/wd/hub/status")
				.then()
				.body("value.message", is("Selenoid 1.11.3 built at 2024-05-25_12:34:40PM"))
				.body("value.ready", is(true))
				.statusCode(200)
				.log().status()
				.log().body();

	}
}
