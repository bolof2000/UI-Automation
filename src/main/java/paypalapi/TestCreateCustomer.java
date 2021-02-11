package paypalapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestCreateCustomer {

    CreateOrder customer = new CreateOrder();
    PurchaseUnit purchaseUnit = new PurchaseUnit("USD","850.00");

   // PayloadOrder payloadOrder = new

    @Test
    public void testCreateCustomerWithPayload(){
        RestAssured.baseURI = "https://api-m.sandbox.paypal.com";
       Response response =  customer.post("v2/checkout/orders");
       response.prettyPrint();
    }
}
