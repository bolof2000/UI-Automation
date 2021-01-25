package apitests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class createCustomerTest {

    @Test
    public void validateCreateCustomer(){

        Response response=  given().auth().basic("sk_test_vbiDRSMl0bT7zJWqK2CNXFQH00smHyQQ0H","sk_test_vbiDRSMl0bT7zJWqK2CNXFQH00smHyQQ0H").
                formParam("email","bolofindebaba@gmail.com").
                formParam("description","description of customer").
                formParam("name","Olusegun").
                formParam("phone","8322452388").
                post(("https://api.stripe.com/v1/customers"));

        // System.out.println(response.statusCode());
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(),200);

    }
}
