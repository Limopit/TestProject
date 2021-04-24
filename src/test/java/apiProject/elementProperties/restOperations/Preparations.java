package apiProject.elementProperties.restOperations;

import apiProject.elementProperties.POJO.Users;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class Preparations {
    static Users users;
    static Response response;
    static String postResult;
    static String putResult;

    @Step("Preparations before deleting test")
    public static void deletePrep(){
        users = new Users.Builder().setId(159).setUsername("delete").setEmail("[]").setPassword("qweasd").setUserStatus(5).build();
        Requests.post(users);
        Requests.delete("delete");
    }

    @Step("Preparations before posting test")
    public static Response postPrep(){
        users = new Users.Builder().setId(159).setUsername("post").setEmail("").setPassword("qweasd").setUserStatus(5).build();
        return response = Requests.post(users);
    }

    @Step("Preparations before getting test")
    public static Response getPrep(){
        users = new Users.Builder().setId(159).setUsername("get").setEmail("").setPassword("qweasd").setUserStatus(5).build();
        Requests.post(users);
        return response = Requests.get("get");
    }

    @Step("Preparations before putting test")
    public static String[] putPrep(){
        users = new Users.Builder().setId(159).setUsername("put").setEmail("").setPassword("qweasd").setUserStatus(5).build();
        Requests.post(users);
        postResult = Requests.get("put").prettyPrint();
        users = new Users.Builder().setId(159).setUsername("put").setEmail("[]").setPassword("qweasd").setUserStatus(5).build();
        response = Requests.update("pit", users);
        putResult = Requests.get("put").prettyPrint();
        String[] arr = new String[2];
        arr[0] = postResult;
        arr[1] = putResult;
        return arr;
    }
}
