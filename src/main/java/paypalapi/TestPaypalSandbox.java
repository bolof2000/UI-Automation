package paypalapi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestPaypalSandbox extends BaseTest{

    @Test(priority = 1)
    public void createOrder(){
        /*
        content type
        authorization
        body

         */

        String jsonbody = "{\n" +
                "  \"intent\": \"CAPTURE\",\n" +
                "  \"purchase_units\": [\n" +
                "    {\n" +
                "      \"amount\": {\n" +
                "        \"currency_code\": \"USD\",\n" +
                "        \"value\": \"100.00\"\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        RestAssured.baseURI = "https://api-m.sandbox.paypal.com";
       Response response=  given()
                .contentType(ContentType.JSON)
                .auth()
                .oauth2(BaseTest.getAuthKey())
                .body(jsonbody)
                .post("v2/checkout/orders");

      // response.prettyPrint();
       //System.out.println(response.jsonPath().get("id").toString());
        Assert.assertEquals(response.statusCode(),200);









    }




    }

