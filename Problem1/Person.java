package Problem1;
// Created person class with name, age and gender of person.
public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    // Created the constructor.
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    // Created getter and setter methods for name, age and gender.
    public String getName() { return myName; }
    public void setName(String name) { this.myName = name; }

    public int getAge() { return myAge; }
    public void setAge(int age) { this.myAge = age; }

    public String getGender() { return myGender; }
    public void setGender(String gender) { this.myGender = gender; }

    // Created toString method
    @Override
    public String toString() {
        return myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}