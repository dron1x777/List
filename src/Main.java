import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bekzat", 16, "Java"));
        students.add(new Student("Karl", 17, "JavaScript"));
        students.add(new Student("Alex", 18, "Java"));
        students.add(new Student("Boston", 19, "JavaScript"));
        students.add(new Student("Alexia", 20, "Java"));
        students.add(new Student("Nurbol", 21, "JavaScript"));
        students.add(new Student("Robert", 22, "Java"));
        students.add(new Student("Ronaldo", 23, "JavaScript"));
        students.add(new Student("Messi", 24, "Java"));

        StudentInterfaceImpl studentInterface = new StudentInterfaceImpl();
        studentInterface.filterStudents(students, "Java", "JavaScript");
        studentInterface.getAllStudents(students);
        studentInterface.filterByAge(students, 18, 20);
        studentInterface.filterByName(students, 'B');
    }
}