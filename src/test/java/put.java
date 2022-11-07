import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class put {


    @Test
    public void test_put_call() {

        File jsonData = new File("src//test//resources//putdata");
        given().
                baseUri("https://reqres.in/api").
                body(jsonData).
                header("Content-Type", "application json").
                when().
                put("/users"). //passing end point
                then().
                statusCode(200).
                body("name",response -> equalTo("Arun")).
                body("job",response -> equalTo("Manager"));

    }
}
