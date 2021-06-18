package com.tyv.testdata;

import org.apache.http.HttpStatus;
import org.testng.annotations.DataProvider;

public class TyvDataProvider {

    @DataProvider( name= "login-data")
    public Object[][] getdata() {

        Object[][] loginData = new Object[][]{
//                here firST two fields are used as input data to request body and the other two are used as to validate the response.
                {"hope_12345", "hope_12345", "hope_12345@gmail.com", HttpStatus.SC_OK},
//                { "mishu123","mishujain", "mishu123@gmail.com", HttpStatus.SC_OK },
//                { "failedUser","failedPwd", null, HttpStatus.SC_UNAUTHORIZED },
        };
        return loginData;
    }
}
