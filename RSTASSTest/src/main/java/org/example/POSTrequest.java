package org.example;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class POSTrequest {

    static String email;
    static String requestBody;

    @BeforeMethod
    public static void setup() {
        RestAssured.baseURI = "https://gorest.co.in/public/v2";

        email = UUID.randomUUID() + "test@gmail.com";

        requestBody = "{\n" +
                "  \"name\": \"von Kurtenburg\",\n" +
                "  \"email\": \"" + email + "\" ,\n" +
                "\"gender\": \"male\",\n" +
                "\"status\" : \"active\"}";
    }

    @Test
    public void postRequest() {

        String bearerToken = "Bearer 4965fecfc06085cebce505e75d688f388e62e2677768dd2ee69119e539f0ec30";

        Response response = given()
                .header("Content-type", "application/json")
                .header("Authorization", bearerToken)
                .and()
                .body(requestBody)
                .when()
                .post("/users")
                .then().log().all()
                .extract().response();

        Assert.assertEquals(201, response.statusCode());

        Assert.assertEquals("von Kurtenburg", response.jsonPath().getString("name"));
        Assert.assertTrue(response.jsonPath().getString("email").contains("test@gmail.com"));
        Assert.assertEquals("male", response.jsonPath().getString("gender"));
        Assert.assertEquals("active", response.jsonPath().getString("status"));
    }
}