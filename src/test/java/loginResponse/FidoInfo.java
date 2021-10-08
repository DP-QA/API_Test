package loginResponse;

import java.util.HashMap;
import java.util.Map;

public class FidoInfo {

    private String id;
    @Override
    public String toString() {
        return "FidoInfo [id=" + id + ", message=" + message + ", userName=" + userName + ", statusCode=" + statusCode
                + ", additionalProperties=" + additionalProperties + "]";
    }

    private String message;
    private String userName;
    private Integer statusCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public FidoInfo() {
    }

    /**
     *
     * @param id
     * @param message
     * @param userName
     * @param statusCode
     */
    public FidoInfo(String id, String message, String userName, Integer statusCode) {
        super();
        this.id = id;
        this.message = message;
        this.userName = userName;
        this.statusCode = statusCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
