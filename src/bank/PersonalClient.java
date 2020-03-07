package bank;

public class PersonalClient extends Client {
    private String firstName;
    private String secondName;

    public PersonalClient (String firstName, String secondName){

        this.firstName = firstName;
        this.secondName = secondName;
    }
}
