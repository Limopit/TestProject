package apiProject.elementProperties.restOperations;

import apiProject.elementProperties.POJO.Users;
import io.qameta.allure.Step;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class Requests {

    private static final RequestSpecification REQ_SPEC = new RequestSpecBuilder()
            .setBaseUri("https://petstore.swagger.io/v2")
            .setBasePath("/user")
            .setContentType(ContentType.JSON)
            .build();

    @Step("Making post request")
    public static Response post(Users users){
        Response response = given()
                .spec(REQ_SPEC)
                .header("api_key", "qwerty")
                .body(users)
                .when().post();
        return response;
    }

    @Step("Making get request")
    public static Response get(String username){
        Response response = given()
                .spec(REQ_SPEC)
                .header("api_key", "qwerty")
                .when().get(username);
        return response;
    }

    @Step("Making delete request")
    public static Response delete(String username){
        Response response = given()
                .spec(REQ_SPEC)
                .header("api_key", "qwerty")
                .when().delete(username);
        return response;
    }

    @Step("Making put request")
    public static Response update(String username, Users users){
        Response response = given()
                .spec(REQ_SPEC)
                .header("api_key", "qwerty")
                .body(users)
                .when().put(username);
        return response;
    }

    @Step("Testing statusCode & body")
    public static void test(Response response){
        response.then().statusCode(200)
                .extract().response().prettyPrint();
    }

    @Step("Testing element deleting")
    public static void getDeletedTest(String username){
        Assert.assertTrue(get(username).prettyPrint().equals("{\n" +
                "    \"code\": 1,\n" +
                "    \"type\": \"error\",\n" +
                "    \"message\": \"User not found\"\n" +
                "}"));
    }

    @Step("Trying to find element")
    public static void getTest(String username){
        Requests.get(username).prettyPrint();
    }
}
