package paypalapi;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateOrder extends HttpMethods{
    @Override
    public Response post(String endpoint) {

       Response response =  given().contentType(ContentType.JSON)
                .auth().oauth2(getAuthKey())
               .body(Payloads.customerPayload())
               .post(endpoint);

       response.prettyPrint();
        return response;
    }

    @Override
    public void get(String endpoint) {

    }

    @Override
    public void put(String endpoint) {

    }

    @Override
    public void patch(String endpoint) {

    }


}
