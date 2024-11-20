package Problem1;

// Created Demo class.
public class Demo {
    public static void main(String[] args) {
        Person john = new Person("John Smith", 32, "M");
        System.out.println(john);

        Student jane = new Student("Jane Doe", 19, "F", "AB1234", 3.5);
        System.out.println(jane);

        Teacher mrsTeacher = new Teacher("Java Teacher", 43, "F", "Java", 600000);
        System.out.println(mrsTeacher);

        CollegeStudent bob = new CollegeStudent("Bob Doyle", 20, "M", "CD5678", 3.6, 1, "Java" );
        System.out.println(bob);
    }
    
}
