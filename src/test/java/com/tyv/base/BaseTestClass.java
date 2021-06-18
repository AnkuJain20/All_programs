package com.tyv.base;

import com.tyv.utils.Constants;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

public class BaseTestClass {

    private static String baseURL;
    public static  String dbUrl;
    public static String dbUname;
    public static String dbPwd;
    private static RequestSpecification requestSpecification;

    public RequestSpecification getRequestSpecification(){
        return requestSpecification;
    }


    static  {
        //Read properties file
        Properties properties = readPropertiesFile();
        //Use Properties to assign values to variables
        baseURL= properties.getProperty("base_url");
        dbUrl= properties.getProperty("db_url");
        dbUname= properties.getProperty("db_uname");
        dbPwd= properties.getProperty("db_pwd");

        requestSpecification = RestAssured.given()
                .baseUri(baseURL)
                .contentType(Constants.JSON_CONTENT_TYPE);

        configureLogging();

    }

    public String getBaseUrl(){
        return baseURL;

    }

    private static void configureLogging() {
        System.setProperty("log4j.configuration", new File("resources", "log4j.properties").toString());
    }

    private static Properties readPropertiesFile() {
        BufferedReader reader;

        Properties properties = null;
        String propertyFilePath = "src/test/resources/configuration.properties";


        try {
            FileReader fileReader = new FileReader(propertyFilePath);

//            reader = new BufferedReader(new FileReader(propertyFilePath));
            reader = new BufferedReader(fileReader);

            try {
                properties = new Properties();
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }

        return properties;
    }

}
