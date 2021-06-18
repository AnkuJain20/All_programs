package com.tyv.tests;

import com.tyv.base.BaseTestClass;
import com.tyv.request.pojo.SignInRequest;
import com.tyv.response.pojo.SignInResponse;
import com.tyv.response.pojo.SignUpResponse;
import com.tyv.testdata.TyvDataProvider;
import com.tyv.utils.Constants;
import com.tyv.utils.DBConnect;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class HomePageTests extends BaseTestClass {

    private static Logger myLogger = LogManager.getLogger(HomePageTests.class.getName());

//    @Test   (dataProvider = "login-data", dataProviderClass = TyvDataProvider.class)
//    public void loginTest(String uname, String pwd, String expectedEmail, int statusCode) {
//
//        RequestSpecification requestSpecification = getRequestSpecification();
//
//        myLogger.info("INFO levels Starting login test.. Info log ");
//        myLogger.debug("Starting loing test with uname:  " + uname) ;
//        myLogger.error("error logs .. Running login user");
//
//
////here we have created java object that will get convert into jason format: Serialization
////       so we created  this signInRequest class an create variables username and password and created theit getter and setter
//        SignInRequest signInRequest = new SignInRequest();
//        signInRequest.setUsername(uname);
//        signInRequest.setPassword(pwd);
//
//        System.out.println("Request object:" + signInRequest);
////        we have override toString method here that will convert jason response into string.
////        here we have passed java object in body that will get converted into json
//
//        SignInResponse signInResponse = given(requestSpecification).body(signInRequest).post(Constants.SIGNIN_API_PATH)
//                .then().assertThat().statusCode(statusCode).extract().as(SignInResponse.class);
//
//        //How this works interanlly
//        // SignInResponse Obj = new SignInResponse()
//        // response -> parse -> obj.setToken(tokenValue), obj.set, o
////      obj will chwck for all the fields and set the values into them.
//
//        System.out.println("Response object:" + signInResponse);
//        String emailActualResponse =  signInResponse.getEmail();
//        Assert.assertEquals(emailActualResponse, expectedEmail);
//    }
    @Test
    public void loginWithMap(){

        RequestSpecification requestSpecification = getRequestSpecification();
        Map<String, String> mapPayload = new HashMap<>();
        mapPayload.put("username", "hope_12345");
        mapPayload.put("password", "hope_12345");

        SignInResponse signInResponse =   given(requestSpecification).body(mapPayload).post(Constants.SIGNIN_API_PATH)
.then().assertThat().statusCode(200).extract().as(SignInResponse.class);
    }




    @Test
    public void signUpSuccess(){
        RequestSpecification requestSpecification = getRequestSpecification();

        JSONObject requestObject = new JSONObject();

        //To generate random id
        String randomId = UUID.randomUUID().toString();
        System.out.println("RandomID: " + randomId);

        requestObject.put("password",randomId);
        requestObject.put("username",randomId.substring(0,18));
        requestObject.put("email",randomId + "@gmail.com");


        SignUpResponse signUpResponse = given(requestSpecification).body(requestObject.toJSONString()).post(Constants.SIGNUP_API_PATH)
                .then().assertThat().extract().as(SignUpResponse.class);

        String actualResponse = signUpResponse.getMessage();
        String expectedResponse = "User registered successfully!";

        Assert.assertEquals(actualResponse, expectedResponse);

        // SignInResponse Obj = new SignInResponse()
        // response -> parse -> obj.setToken(tokenValue), obj.set, o
        System.out.println(signUpResponse.toString());

        //Check in db that randomId present or not.
        DBConnect dbConnect = new DBConnect();
        dbConnect.connectAndCheck(randomId.substring(0,18));



    }


}
