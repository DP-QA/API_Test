package loginResponse;


import java.util.HashMap;
import java.util.Map;


public class LoginResponse {

    @Override
    public String toString() {
        return "LoginResponse [userInfo=" + userInfo + ", fidoInfo=" + fidoInfo + ", additionalProperties="
                + additionalProperties + "]";
    }

    private UserInfo userInfo;
    private FidoInfo fidoInfo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public LoginResponse() {
    }

    /**
     *
     * @param userInfo
     * @param fidoInfo
     */
    public LoginResponse(UserInfo userInfo, FidoInfo fidoInfo) {
        super();
        this.userInfo = userInfo;
        this.fidoInfo = fidoInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public FidoInfo getFidoInfo() {
        return fidoInfo;
    }

    public void setFidoInfo(FidoInfo fidoInfo) {
        this.fidoInfo = fidoInfo;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
