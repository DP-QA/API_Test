package requestPOJOs;

public class UpdateCustomerInfo {
    private String education;
    private String employerNm;
    private String channel;
    private String occupationCd;

    /**
     * No args constructor for use in serialization
     *
     */
    public UpdateCustomerInfo() {
    }


    public UpdateCustomerInfo(String education, String employerNm, String channel, String occupationCd) {
        super();
        this.education = education;
        this.employerNm = employerNm;
        this.channel = channel;
        this.occupationCd = occupationCd;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmployerNm() {
        return employerNm;
    }

    public void setEmployerNm(String employerNm) {
        this.employerNm = employerNm;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOccupationCd() {
        return occupationCd;
    }

    public void setOccupationCd(String occupationCd) {
        this.occupationCd = occupationCd;
    }
}
