package Model;

import java.util.List;

public class Pharmacy {
    private String name;
    private String address;
    private List<Employee> employees;
    private List<Medicine> medicines;
    private long ID;
    private long counter;

    public Pharmacy(String name, String address) {
        this.name = name;
        this.address = address;
        this.ID = ++counter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Model.Pharmacy{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                ", medicines=" + medicines +
                '}';
    }

}

