package com.tyv.tests;

import com.github.fge.jsonschema.core.report.LogLevel;
import com.tyv.base.BaseTestClass;
import com.tyv.request.pojo.SignInRequest;
import com.tyv.response.pojo.SignInResponse;
import com.tyv.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class AuthenticatedApiTests extends BaseTestClass {

    private String authToken;

    private static Logger log= LogManager.getLogger(AuthenticatedApiTests.class.getName());

    @BeforeTest
    public void loginUser(){

        RequestSpecification requestSpecification = getRequestSpecification();

        System.out.println("IN efore test");

        //POST SignIn: SingIN data, API call signIn, response, token
        SignInRequest signInRequest = new SignInRequest();
        signInRequest.setUsername("mishu123");
        signInRequest.setPassword("mishujain");

        SignInResponse signInResponse = given().spec(requestSpecification).body(signInRequest)
                .when().post(Constants.SIGNIN_API_PATH)
                .then().extract().as(SignInResponse.class);

        String tokenFromResponse = signInResponse.getToken();
        authToken = "Bearer "+tokenFromResponse;

        System.out.println("created auth toke: " + authToken);
    }

    @Test
    public void testEncryptionToolDownload(){
        System.out.println("Running test testEncryptionToolDownload");
        given().header("Authorization", authToken).when().get(Constants.ENCTOOL_API_PATH).then().statusCode(200);
    }

    @Test
    public void testEncryptionToolDownload2(){
        System.out.println("Runing test testEncryptionToolDownload2");
        given().when().get(Constants.ENCTOOL_API_PATH).then().statusCode(401);
    }
    @Test
    public void testStudentByVendorId(){
        System.out.println("Runing test testStudentByVendorId");
        given().header("Authorization",authToken).when().get(Constants.VendorId_PATH).then().statusCode(200);
    }


    @Test
    public void allDetails(){
        String baseURL = "http://dummy.com";

        RequestSpecification requestSpecification = RestAssured.given()
                .baseUri(baseURL).contentType("application/json");

        JSONObject requestObject = new JSONObject();
        requestObject.put("username", "name1");

         given().spec(requestSpecification).body(requestObject)
                .when().post(Constants.SIGNIN_API_PATH)
                .then().statusCode(200).extract().as(String.class);

       //String response
        given().spec(requestSpecification).body(requestObject).accept("text/plain")
                .when().post(Constants.SIGNIN_API_PATH)
                .then().statusCode(200).body(equalTo("Created"));

        given().spec(requestSpecification).body(requestObject)
                .when().post(Constants.SIGNIN_API_PATH)
                .then().statusCode(200).body("arr[0]", equalTo("1"));

        given().spec(requestSpecification).body(requestObject)
                .when().post(Constants.SIGNIN_API_PATH)
                .then().statusCode(200)
                .body("size()", is(5));


        //body("fieldName[0]", equalTo("TextName");  -- from JsonResponse array



    }


}
