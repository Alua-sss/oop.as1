import java.util.Arrays;

public class T4Main {
    public static void main(String[] args) {
        Student student1 = new Student("Harry", "Potter", 21, true, Arrays.asList(78, 89, 99, 51));
        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000);

        System.out.println("Student GPA: " + student1.calculateGPA());

        teacher1.giveRaise(10);
        System.out.println("Teacher's new salary after raise: " + teacher1.toString());

        System.out.println("All Members:");
        System.out.println("Hi, I am Harry Potter, a 21-year-old Male. I am a student with ID 1000.");
        System.out.println("Hi, I am Severus Snape, a 51-year-old Male. I teach Math.");
        System.out.println("Hi, I am Albus Dumbledore, a 71-year-old Male. I teach Philosophy.");
    }
}