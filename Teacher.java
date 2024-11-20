// Created Teacher class.
public class Teacher extends Person{
    private String subject;
    private double salary;

    // Created constructor.
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Created getter and setter methods for subject and salary for teacher.
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // Created toString method.
    @Override
    public String toString() {
        return super.toString() + ", Teaches: " + subject + ", Salary: " + salary;
    }
    
}
