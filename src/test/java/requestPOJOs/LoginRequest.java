package requestPOJOs;

public class LoginRequest {

    private String authType;
    private String userCd;
    private String deviceToken;
    private String message;


    public LoginRequest(String authType, String userCd, String deviceToken, String message) {
        super();
        this.authType = authType;
        this.userCd = userCd;
        this.deviceToken = deviceToken;
        this.message = message;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getUserCd() {
        return userCd;
    }

    public void setUserCd(String userCd) {
        this.userCd = userCd;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
