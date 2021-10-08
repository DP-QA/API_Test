package apiReusables;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import java.io.File;

public class SerializeDeserialize {
    public static Object deserialize(String jsonFile, Class className) {

        Object obj1 = null;

        try {

            String completePath = System.getProperty("user.dir") + "/src/test/resources/requstJSON/" + jsonFile;

            ObjectMapper mapper = new ObjectMapper();

            obj1 = mapper.readValue(new File(completePath), className);

        } catch (Exception e) {
            // TODO: handle exception
        }
        return obj1;

    }
    public static Object serialize(Response response, Class className) {

        Object obj1 = null ;

        try {

            ObjectMapper mapper = new ObjectMapper();

            obj1 = mapper.readValue(response.asString(), className);

        } catch (Exception e) {
            // TODO: handle exception
        }
        return obj1;

    }
}
