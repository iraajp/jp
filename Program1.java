public class Program1 {
    public static void main(String[] args) {
        Student student1 = new Student("Srishti", 40);
        Student student2 = new Student("Raaj", 92);
        Student student3 = new Student("Vaishnavi", 78);
        Student student4 = new Student("Daivik", 96);
        Student student5 = new Student("krishna", 88);
        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Grade: " + student.getGrade());
            if (student.getGrade() >= 90) {
                System.out.println("Excellent performance!");
            } else if (student.getGrade() >= 80) {
                System.out.println("Good performance!");
            } else if (student.getGrade() >= 70) {
                System.out.println("Average performance!");
            } else {
                System.out.println("Needs improvement!");
            }
            System.out.println();
        }
    }
}

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

// This program demonstrates classes and objects in Java.
// It creates Student objects, stores them in an array, and uses looping and branching
// to evaluate and display their performance based on grades.