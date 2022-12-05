package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class PUTrequest {

    static String email;
    static String requestBody;

    @BeforeMethod
    public static void setup() {
        RestAssured.baseURI = "https://gorest.co.in/public/v2";

        email = UUID.randomUUID() + "test@gmail.com";

        requestBody = "{\n" +
                "\"id\": \"3548\",\n" +
                "  \"name\": \"von Kahlenberg\",\n" +
                "  \"email\": \"" + email + "\" ,\n" +
                "\"gender\": \"male\",\n" +
                "\"status\" : \"active\"}";
    }

    @Test
    public void putRequest() {

        String bearerToken = "Bearer 4965fecfc06085cebce505e75d688f388e62e2677768dd2ee69119e539f0ec30";

        Response response = given()
                .header("Content-type", "application/json")
                .header("Authorization", bearerToken)
                .and()
                .body(requestBody)
                .when()
                .put("/users/3548")
                .then().log().all()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());

        Assert.assertEquals("3548", response.jsonPath().getString("id"));
        Assert.assertEquals("von Kahlenberg", response.jsonPath().getString("name"));
        Assert.assertTrue(response.jsonPath().getString("email").contains("test@gmail.com"));
        Assert.assertEquals("male", response.jsonPath().getString("gender"));
        Assert.assertEquals("active", response.jsonPath().getString("status"));
    }

}
