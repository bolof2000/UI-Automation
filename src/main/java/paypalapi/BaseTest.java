package paypalapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseTest {

    public static final String grant = "grant_type";
    public static final String grant_value = "client_credentials";
    public static final String client_id  = "AXY_zI9O3eRnJ-rrJrOp9-_HfHmD74WYSEQJ9Vqjgv7XBiJnwjEuDSOCKKbHpyFEqqxKemwKVvv5vfUM";
    public static final String secret_key = "EDtXSiFKMTFduKEh3fRJBcU5vb14EWVky_tltO9nA-hLpAwykby0UWSuLbwcQ1PScSLTBuGyO4Z8KXvK";

       public static String getAuthKey(){

        String access_token;

        Response response = given().param(grant,grant_value).auth().preemptive().basic(client_id,secret_key).post("v1/oauth2/token");
        access_token = response.jsonPath().get("access_token").toString();
        return access_token;



    }

}

