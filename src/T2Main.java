
import java.util.Arrays;

public class T2Main {
    public static void main(String[] args) {
        Student student = new Student("Harry", "Potter", 21, true, Arrays.asList(78, 89, 99, 51));
        Teacher teacher = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);

        System.out.println(student.toString());
        System.out.println(teacher.toString());
    }
}