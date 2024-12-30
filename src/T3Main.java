import java.util.Arrays;

public class T3Main {
    public static void main(String[] args) {
        Student student1 = new Student("Harry", "Potter", 21, true, Arrays.asList(78, 89, 99, 51));
        Student student2 = new Student("Ron", "Weasley", 20, true, Arrays.asList(78, 89, 75, 63, 82));
        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000);

        School school = new School();

        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        System.out.println("School Members:");
        System.out.println(school.toString());
    }
}