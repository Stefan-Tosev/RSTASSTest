package org.example;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GET_Token {

    @Test
    public void getData() {
        RequestSpecification httpRequest = RestAssured.given();
        Response res = httpRequest.get("https://gorest.co.in/public/v2");
        ResponseBody body = res.body();
        //Converting the response body to string

        String rbdy = body.asString();
        System.out.println("Data from the GET API- "+rbdy);
    }
}