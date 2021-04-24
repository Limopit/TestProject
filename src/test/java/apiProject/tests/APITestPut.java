package apiProject.tests;

import apiProject.elementProperties.restOperations.Preparations;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITestPut {
    String postResult;
    String putResult;

    @BeforeTest
    public void prepare() {
        postResult = Preparations.putPrep()[0];
        putResult = Preparations.putPrep()[1];
    }

    @Test
    public void test() {
        Assert.assertFalse(postResult.equals(putResult));
    }
}
