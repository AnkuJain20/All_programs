package com.tyv.tests;

import com.tyv.base.BaseTestClass;
import com.tyv.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DummyTest extends BaseTestClass {

    @Override
    public RequestSpecification getRequestSpecification() {
        RequestSpecification requestSpecification =  RestAssured.given()
                .baseUri("changedURL")
                .contentType(Constants.JSON_CONTENT_TYPE);
        return requestSpecification;
    }

    @Test
    public void newTest(){
        RequestSpecification requestSpecification = getRequestSpecification();
    }


}
