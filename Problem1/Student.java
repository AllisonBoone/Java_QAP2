package Problem1;
// Created Student class.

public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;
    

    // Created the constructor.
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // Created getter and setter methods for idNum and gpa.
    public String getIdNum() { return myIdNum; }
    public void setIdNum(String idNum) { this.myIdNum = idNum; }

    public double getGPA() { return myGPA; }
    public void setGPA(double gpa) { this.myGPA = gpa; }

    // Created toString method.
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
