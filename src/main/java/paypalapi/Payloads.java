package paypalapi;

public class Payloads {

    private static String jsonBody;


    public static String customerPayload(){

        return jsonBody = "{\n" +
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



    }
}
