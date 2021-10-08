package loginResponse;

import java.util.HashMap;
import java.util.Map;

public class UserInfo {
    private String idDocType;
    private Boolean firstLogin;
    private Object title;
    private Boolean hasUTAccount;
    private String userID;
    private Boolean hasRoboAccount;
    private String prefLang;
    private String countryCode;
    private String loginName;
    private Boolean sprints;
    private String email;
    private Boolean hasSKAccount;
    private Boolean ekyc;
    private Boolean hasCiticToken;
    private Boolean staff;
    private String mobileNo;
    private String userName;
    private Boolean canPostponePasswdChange;
    private String lastLoginFailed;
    private String lastLoginSuccess;
    private Boolean hasSmsBouncedBack;
    private Boolean passwdExpired;
    private String custType;
    private Boolean remindChgPasswd;
    private Boolean hasEmailBouncedBack;
    private Boolean hasMcssaAccount;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public UserInfo() {
    }

    /**
     *
     * @param idDocType
     * @param firstLogin
     * @param title
     * @param hasUTAccount
     * @param userID
     * @param hasRoboAccount
     * @param prefLang
     * @param countryCode
     * @param loginName
     * @param sprints
     * @param email
     * @param hasSKAccount
     * @param ekyc
     * @param hasCiticToken
     * @param staff
     * @param mobileNo
     * @param userName
     * @param canPostponePasswdChange
     * @param lastLoginFailed
     * @param lastLoginSuccess
     * @param hasSmsBouncedBack
     * @param passwdExpired
     * @param custType
     * @param remindChgPasswd
     * @param hasEmailBouncedBack
     * @param hasMcssaAccount
     */
    public UserInfo(String idDocType, Boolean firstLogin, Object title, Boolean hasUTAccount, String userID,
                    Boolean hasRoboAccount, String prefLang, String countryCode, String loginName, Boolean sprints,
                    String email, Boolean hasSKAccount, Boolean ekyc, Boolean hasCiticToken, Boolean staff, String mobileNo,
                    String userName, Boolean canPostponePasswdChange, String lastLoginFailed, String lastLoginSuccess,
                    Boolean hasSmsBouncedBack, Boolean passwdExpired, String custType, Boolean remindChgPasswd,
                    Boolean hasEmailBouncedBack, Boolean hasMcssaAccount) {
        super();
        this.idDocType = idDocType;
        this.firstLogin = firstLogin;
        this.title = title;
        this.hasUTAccount = hasUTAccount;
        this.userID = userID;
        this.hasRoboAccount = hasRoboAccount;
        this.prefLang = prefLang;
        this.countryCode = countryCode;
        this.loginName = loginName;
        this.sprints = sprints;
        this.email = email;
        this.hasSKAccount = hasSKAccount;
        this.ekyc = ekyc;
        this.hasCiticToken = hasCiticToken;
        this.staff = staff;
        this.mobileNo = mobileNo;
        this.userName = userName;
        this.canPostponePasswdChange = canPostponePasswdChange;
        this.lastLoginFailed = lastLoginFailed;
        this.lastLoginSuccess = lastLoginSuccess;
        this.hasSmsBouncedBack = hasSmsBouncedBack;
        this.passwdExpired = passwdExpired;
        this.custType = custType;
        this.remindChgPasswd = remindChgPasswd;
        this.hasEmailBouncedBack = hasEmailBouncedBack;
        this.hasMcssaAccount = hasMcssaAccount;
    }

    public String getIdDocType() {
        return idDocType;
    }

    public void setIdDocType(String idDocType) {
        this.idDocType = idDocType;
    }

    public Boolean getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Boolean getHasUTAccount() {
        return hasUTAccount;
    }

    public void setHasUTAccount(Boolean hasUTAccount) {
        this.hasUTAccount = hasUTAccount;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Boolean getHasRoboAccount() {
        return hasRoboAccount;
    }

    public void setHasRoboAccount(Boolean hasRoboAccount) {
        this.hasRoboAccount = hasRoboAccount;
    }

    public String getPrefLang() {
        return prefLang;
    }

    public void setPrefLang(String prefLang) {
        this.prefLang = prefLang;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLoginName() {
        return loginName;
    }

    @Override
    public String toString() {
        return "UserInfo [idDocType=" + idDocType + ", firstLogin=" + firstLogin + ", title=" + title
                + ", hasUTAccount=" + hasUTAccount + ", userID=" + userID + ", hasRoboAccount=" + hasRoboAccount
                + ", prefLang=" + prefLang + ", countryCode=" + countryCode + ", loginName=" + loginName + ", sprints="
                + sprints + ", email=" + email + ", hasSKAccount=" + hasSKAccount + ", ekyc=" + ekyc
                + ", hasCiticToken=" + hasCiticToken + ", staff=" + staff + ", mobileNo=" + mobileNo + ", userName="
                + userName + ", canPostponePasswdChange=" + canPostponePasswdChange + ", lastLoginFailed="
                + lastLoginFailed + ", lastLoginSuccess=" + lastLoginSuccess + ", hasSmsBouncedBack="
                + hasSmsBouncedBack + ", passwdExpired=" + passwdExpired + ", custType=" + custType
                + ", remindChgPasswd=" + remindChgPasswd + ", hasEmailBouncedBack=" + hasEmailBouncedBack
                + ", hasMcssaAccount=" + hasMcssaAccount + ", additionalProperties=" + additionalProperties + "]";
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Boolean getSprints() {
        return sprints;
    }

    public void setSprints(Boolean sprints) {
        this.sprints = sprints;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getHasSKAccount() {
        return hasSKAccount;
    }

    public void setHasSKAccount(Boolean hasSKAccount) {
        this.hasSKAccount = hasSKAccount;
    }

    public Boolean getEkyc() {
        return ekyc;
    }

    public void setEkyc(Boolean ekyc) {
        this.ekyc = ekyc;
    }

    public Boolean getHasCiticToken() {
        return hasCiticToken;
    }

    public void setHasCiticToken(Boolean hasCiticToken) {
        this.hasCiticToken = hasCiticToken;
    }

    public Boolean getStaff() {
        return staff;
    }

    public void setStaff(Boolean staff) {
        this.staff = staff;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getCanPostponePasswdChange() {
        return canPostponePasswdChange;
    }

    public void setCanPostponePasswdChange(Boolean canPostponePasswdChange) {
        this.canPostponePasswdChange = canPostponePasswdChange;
    }

    public String getLastLoginFailed() {
        return lastLoginFailed;
    }

    public void setLastLoginFailed(String lastLoginFailed) {
        this.lastLoginFailed = lastLoginFailed;
    }

    public String getLastLoginSuccess() {
        return lastLoginSuccess;
    }

    public void setLastLoginSuccess(String lastLoginSuccess) {
        this.lastLoginSuccess = lastLoginSuccess;
    }

    public Boolean getHasSmsBouncedBack() {
        return hasSmsBouncedBack;
    }

    public void setHasSmsBouncedBack(Boolean hasSmsBouncedBack) {
        this.hasSmsBouncedBack = hasSmsBouncedBack;
    }

    public Boolean getPasswdExpired() {
        return passwdExpired;
    }

    public void setPasswdExpired(Boolean passwdExpired) {
        this.passwdExpired = passwdExpired;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public Boolean getRemindChgPasswd() {
        return remindChgPasswd;
    }

    public void setRemindChgPasswd(Boolean remindChgPasswd) {
        this.remindChgPasswd = remindChgPasswd;
    }

    public Boolean getHasEmailBouncedBack() {
        return hasEmailBouncedBack;
    }

    public void setHasEmailBouncedBack(Boolean hasEmailBouncedBack) {
        this.hasEmailBouncedBack = hasEmailBouncedBack;
    }

    public Boolean getHasMcssaAccount() {
        return hasMcssaAccount;
    }

    public void setHasMcssaAccount(Boolean hasMcssaAccount) {
        this.hasMcssaAccount = hasMcssaAccount;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
