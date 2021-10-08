package apiReusables;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;


import java.util.HashMap;
import java.util.Map;

public class APICommonMethods {
    public static Map<String,String> authentication  = new HashMap<String , String>();

    public static JSONObject requestBody() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("username", "nwkwong");
        requestParams.put("password", "Aa123456");
        return requestParams;
    }

    public static Map headers() {
        Map header = new HashMap<>();
        header.put("Content-Type", "application/json");
        return header;

    }

    public Response sendGetRequest(String baseURI, Map headers) {

        RestAssured.baseURI = baseURI;

        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.headers(headers);

        Response response = httpRequest.get();

        return response;

    }

}
