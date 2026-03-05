package Dao;

import Model.Employee;
import Model.Medicine;
import Model.Pharmacy;

import java.util.List;

public interface PharmacyDao {
    public void add(Pharmacy pharmacy);
    public Pharmacy getById(long id);
    public List<Pharmacy> getAll();
    public Pharmacy getByName(String name);
    public Pharmacy getByAddress(String address);
    public List<Employee> getEmployeesByPharmacyId(long id);
    public List<Medicine> getMedicinesByPharmacyId(long id);
    public boolean update(long id, Pharmacy pharmacy);
    public boolean deleteById(long id);
}
