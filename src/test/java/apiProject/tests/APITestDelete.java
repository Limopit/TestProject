package apiProject.tests;

import apiProject.elementProperties.restOperations.Preparations;
import apiProject.elementProperties.restOperations.Requests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITestDelete {

    @BeforeTest
    public void prepare(){
        Preparations.deletePrep();
    }

    @Test
    public void test() {
        Requests.getDeletedTest("limo");
    }
}
