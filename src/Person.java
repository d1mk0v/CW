public class Person {
    private String lastName;
    private String firstName;
    private String secondName;

    public Person(String lastName, String firstName, String secondName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
    @Override
    public String toString() {
        return lastName + " " + firstName + " " + secondName;
    }
}
