package am.aca.musicapp.comman.bean;

/**
 * Created by Roman on 9/10/2016.
 */
public class Person {
    private Integer person_ID;
    private String firstName;
    private String lastName;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getPerson_ID() {
        return person_ID;
    }

    public void setPerson_ID(Integer person_ID) {
        this.person_ID = person_ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'';
    }
}
