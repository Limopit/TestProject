package apiProject.tests;

import apiProject.elementProperties.restOperations.Preparations;
import apiProject.elementProperties.restOperations.Requests;
import io.restassured.response.Response;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITestPost {
    Response response;

    @BeforeTest
    public void prepare(){
        response = Preparations.postPrep();
    }

    @Test
    public void test(){
        Requests.test(response);
        Requests.getTest("post");
    }

    @AfterTest
    public void ending(){
        Requests.delete("post");
    }
}
