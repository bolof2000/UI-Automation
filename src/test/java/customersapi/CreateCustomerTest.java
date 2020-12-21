package customersapi;
import io.restassured.RestAssured;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class CreateCustomerTest {


    @Test
    public void validateCreateCustomerAPIwithValidCredentials(){



        given().auth().basic("","").
                formParam("","").
                formParam("","").
                formParam("","").
                post("");



    }
}
