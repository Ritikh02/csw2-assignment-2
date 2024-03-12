
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

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rn + ", Total Marks: " + totalMark;
    }
}

public class A2Q5 { //StudentSort class
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ritikh", 101, 85),
                new Student("Prince", 102, 78),
                new Student("Retam", 103, 90),
                new Student("Deepak", 100, 95)
        };

        System.out.println("Before sorting:");
        printArray(students);

        bubbleSort(students);

        System.out.println("\nAfter sorting by roll number:");
        printArray(students);
    }

    private static void bubbleSort(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(Student[] arr) {
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
