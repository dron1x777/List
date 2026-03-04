import java.util.ArrayList;
import java.util.List;

public class StudentInterfaceImpl implements StudentInterface {
    @Override
    public void getAllStudents(List<Student> studentList) {
        for (Student student : studentList) System.out.println(student);
    }

    @Override
    public void filterStudents(List<Student> studentList, String group1, String group2) {
        List<Student> group1list = new ArrayList<>();
        List<Student> group2list = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getGroup().equalsIgnoreCase(group1) ) {
                group1list.add(student);
            } else if (student.getGroup().equalsIgnoreCase(group2) ) {
                group2list.add(student);
            }
        }
        System.out.println(group1 + " " + group1list);
        System.out.println(group2 + " " + group2list);

    }

    @Override
    public void filterByAge(List<Student> studentList, int min, int max) {
        for (Student student : studentList) {
            if (student.getAge() >= min && student.getAge() <= max) {
                System.out.println(student);
            }
        }
    }

    @Override
    public void filterByName(List<Student> studentList, char letter) {
        for (Student student : studentList) {
            if (student.getName().charAt(0) == letter) {
                System.out.println(student);
            }
        }
    }
}
