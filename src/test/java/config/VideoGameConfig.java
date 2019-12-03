package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;

public class VideoGameConfig {

    public static RequestSpecification videoGame_requestSpec;
    public static ResponseSpecification videoGame_responseSpec;

    @BeforeClass
    public static void setup() {

        videoGame_requestSpec = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setBasePath("/app/")
                .setPort(8080)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();

        videoGame_responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

        RestAssured.requestSpecification = videoGame_requestSpec;
        RestAssured.responseSpecification = videoGame_responseSpec;

    }
}