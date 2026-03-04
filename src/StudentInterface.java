import java.util.List;

public interface StudentInterface {
    void getAllStudents(List<Student> studentList);
    void filterStudents(List<Student> studentList, String group1, String group2);
    void filterByAge(List<Student> studentList, int min, int max);
    void filterByName(List<Student> studentList, char letter);
}
