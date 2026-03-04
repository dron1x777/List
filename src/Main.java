import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee("employee1", 34, "builder"),
                new Employee("employee2", 26, "doctor"),
                new Employee("employee3", 35, "manager"),
                new Employee("employee4", 49, null)
        ));

        for (Employee employee : employees) {
            if(employee.getName().equals("employee1")) {
                try {
                    employee.setAge(-46);
                } catch (Exception e) {
                    System.out.println(e.getMessage());;
                }
            }
        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        try{
            employees.get(6);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("program over");
        }

    }
}