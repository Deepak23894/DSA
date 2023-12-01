package Streams;

public class Person implements Comparable<Person> {
    public String firstName;
    public String lastName;
    public int empNum;

    public Person(String firstName, String lastName, int empNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empNum = empNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empNum=" + empNum +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return o.empNum-empNum;
    }
}
