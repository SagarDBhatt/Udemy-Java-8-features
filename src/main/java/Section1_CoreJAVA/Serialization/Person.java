package Section1_CoreJAVA.Serialization;

import java.io.Serializable;

public class Person implements Serializable {

    private int personId;
    private String personName;
    private int personAge;

/*    public Person(int personId, String personName, int personAge){
        this.personId = personId;
        this.personName = personName;
    }*/

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Person Information : Name : " + getPersonName() + " Age : " + getPersonAge();
    }
}
