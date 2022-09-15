package restapi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class RestOne {

    public void GetBooksDetails() {

        //RestAssured.baseURI = "https://reqres.in/api/users?page=2";
        RestAssured.baseURI = "https://run.mocky.io/v3/8ec8f4f7-8e68-4f4b-ad18-4f0940d40bb7";
        Response response = given().when().get();

        //System.out.println(response.getBody().asString());

        //System.out.println("Response body "+response.getBody());

        JsonPath jsonPath = response.jsonPath();

        //System.out.println("Value is --> " + jsonPath.getString("id"));

        //System.out.println("Value is --> " + jsonPath.getString("name"));

        List<String> responseList = jsonPath.getList("Location");

        jsonPath.getList("Location").forEach(val -> System.out.println(val));

        JsonPath jsonPath_One = new JsonPath(response.asString());
        System.out.println("Hello --->   "+jsonPath_One.getString("Location.State"));

    }

    public static void main(String[] args) {
        RestOne restOne= new RestOne();
        restOne.GetBooksDetails();
    }

}
