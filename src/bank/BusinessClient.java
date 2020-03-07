package bank;

public class BusinessClient extends Client {
    private String name;

    public BusinessClient(String name) {
        this.name = name;
    }

    public String getNip() {
        return "12345";
    }

}
