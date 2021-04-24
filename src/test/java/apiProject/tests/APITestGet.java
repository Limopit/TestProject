package apiProject.tests;

import apiProject.elementProperties.restOperations.Preparations;
import apiProject.elementProperties.restOperations.Requests;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITestGet {

     Response response;

    @BeforeTest
    public void prepare(){
        response = Preparations.getPrep();
    }

    @Test
    public void test() {
        Requests.test(response);
    }
}
