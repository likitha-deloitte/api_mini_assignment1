import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class get {

    @Test
    public void test_get_call() {
        given().
                baseUri("https://jsonplaceholder.typicode.com").
                header("Content-Type", "application json").
                when().
                get("/posts"). //passing end point
                then().
                statusCode(200).
                body("id",hasItem(40)).
                body("userId",hasItem(2));
    }

}