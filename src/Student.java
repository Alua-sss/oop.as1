import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int nextStudentID = 1000;
    private int studentID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, age, gender);
        this.studentID = nextStudentID++;
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return grades.isEmpty() ? 0 : total / (double) grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}

