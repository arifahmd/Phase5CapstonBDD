package restassured;


import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class completebookings extends testbase{
	
	@Test
	public void complete_booking( ) {
		logger.info("Inside POST method");
		RestAssured
			.when()
				.get("http://localhost:9090/FlyAway/completepurchase")
			.then()
				.assertThat()
				.statusCode(200);
			
	}

}
