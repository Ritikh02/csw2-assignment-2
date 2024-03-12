/*Write a program to create a Student class that has members, name, roll
number, and age. Design the Student class in such a way that it can take
the roll number as an integer or string. Create a driver class that creates
student objects and invokes the methods. */

class Student {
    private String name;
    private Object rollNumber;
    private int age;

    public Student(String name, Object rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Object rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name='" + name + '\'' + ", RollNumber=" + rollNumber + ", Age=" + age ;
    }
}

public class A2Q1 { //Driver class
    public static void main(String[] args) {
        Student student1 = new Student("Ritikh", 01, 20);
        Student student2 = new Student("Prince", "02A", 89);
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        student1.setName("Ghost");
        student2.setAge(22);
        System.out.println("\nModified Student 1: " + student1);
        System.out.println("Modified Student 2: " + student2);
    }
}
