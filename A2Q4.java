class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;

    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.rn, otherStudent.rn);
    }
}

public class A2Q4 { //StudentSearch class
    public static void main(String[] args) {
        Student[] students = {
                new Student("Prince", 101, 85),
                new Student("Ritikh", 102, 78),
                new Student("Deepak", 103, 90)
        };

        int searchRN = 102;
        int foundIndex = linearSearch(students, searchRN);

        if (foundIndex != -1) {
            System.out.println("Student found:");
            System.out.println("Name: " + students[foundIndex].getName());
            System.out.println("Roll Number: " + students[foundIndex].getRn());
            System.out.println("Total Marks: " + students[foundIndex].getTotalMark());
        } else {
            System.out.println("Student with roll number " + searchRN + " not found.");
        }
    }

    private static int linearSearch(Student[] students, int rn) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getRn() == rn) {
                return i;
            }
        }
        return -1; 
    }
}
