import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        members.sort((a, b) -> a.toString().compareTo(b.toString()));  // Сортировка по фамилии
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}