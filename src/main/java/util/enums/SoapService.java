package util.enums;

public enum SoapService {
    BASE_URL("https:/www.dneonline.com/"),
    ADD_NUMBERS("calculator.asmx");
    private String uri;
    SoapService(String uri) {
        this.uri = uri;
    }
    @Override
    public String toString() {
        return uri;
    }
}
