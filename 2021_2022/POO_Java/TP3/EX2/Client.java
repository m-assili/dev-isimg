package ex2;

public class Client {
    private String lastName;
    private String firstName;
    private Long cnamID;

    public Client(String lastName, String firstName, Long cnamID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.cnamID = cnamID;
    }


    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", cnamID=" + cnamID +
                '}';
    }
    public void displayClient(){
        System.out.println(this);
    }

    public Long getCnamID() {
        return cnamID;
    }
}
