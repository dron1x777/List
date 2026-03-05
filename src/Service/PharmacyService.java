package Service;

import Exceptions.PharmacyNotFound;
import Model.Employee;
import Model.Medicine;
import Model.Pharmacy;

import java.util.List;

public interface PharmacyService {
    public void add(Pharmacy pharmacy) throws PharmacyNotFound;
    public Pharmacy getById(long id) throws PharmacyNotFound;
    public List<Pharmacy> getAll() throws PharmacyNotFound;
    public Pharmacy getByName(String name) throws PharmacyNotFound;
    public Pharmacy getByAddress(String address) throws PharmacyNotFound;
    public List<Employee> getEmployeesByPharmacyId(long id) throws PharmacyNotFound;
    public List<Medicine> getMedicinesByPharmacyId(long id) throws PharmacyNotFound;
    public boolean update(long id, Pharmacy pharmacy) throws PharmacyNotFound;
    public boolean deleteById(long id) throws PharmacyNotFound;
}
