package Service.Impl;

import Dao.Impl.PharmacyDaoImpl;
import Exceptions.PharmacyNotFound;
import Model.Employee;
import Model.Medicine;
import Model.Pharmacy;
import Service.PharmacyService;

import java.util.List;

public class PharmacyServiceImpl implements PharmacyService {
    private PharmacyDaoImpl pharmacyDaoImpl = new PharmacyDaoImpl();
    @Override
    public void add(Pharmacy pharmacy) throws PharmacyNotFound {
        if(pharmacy == null) {
            throw new PharmacyNotFound("Pharmacy is null");
        }
        if (pharmacy.getAddress() == null || pharmacy.getAddress().isEmpty()) {
            throw new PharmacyNotFound("Pharmacy address is null");
        }
        if (pharmacy.getName() == null || pharmacy.getName().isEmpty()) {
            throw new PharmacyNotFound("Pharmacy name is null");
        }
        if (pharmacy.getID() == 0) {
            throw new PharmacyNotFound("Pharmacy ID is null");
        }
        pharmacyDaoImpl.add(pharmacy);
        System.out.println("Pharmacy added successfully");
    }

    @Override
    public Pharmacy getById(long id) throws PharmacyNotFound {
        if (id  == 0) {
            throw new PharmacyNotFound("Pharmacy ID is null");
        }
        return pharmacyDaoImpl.getById(id);
    }

    @Override
    public List<Pharmacy> getAll() throws PharmacyNotFound {
        return pharmacyDaoImpl.getAll();
    }

    @Override
    public Pharmacy getByName(String name) throws PharmacyNotFound {
        if (name == null || name.isEmpty()) {
            throw new PharmacyNotFound("Pharmacy name is null");
        }
        return pharmacyDaoImpl.getByName(name);
    }

    @Override
    public Pharmacy getByAddress(String address) throws PharmacyNotFound {
        if (address == null || address.isEmpty()) {
            throw new PharmacyNotFound("Pharmacy address is null");
        }
        return pharmacyDaoImpl.getByAddress(address);
    }

    @Override
    public List<Employee> getEmployeesByPharmacyId(long id) throws PharmacyNotFound {
        if (id == 0) {
            throw new PharmacyNotFound("Pharmacy ID is null");
        }
        return pharmacyDaoImpl.getEmployeesByPharmacyId(id);
    }

    @Override
    public List<Medicine> getMedicinesByPharmacyId(long id) throws PharmacyNotFound {
        if (id == 0) {
            throw new PharmacyNotFound("Pharmacy ID is null");
        }
        return pharmacyDaoImpl.getMedicinesByPharmacyId(id);
    }

    @Override
    public boolean update(long id, Pharmacy pharmacy) throws PharmacyNotFound {
        if(pharmacy == null) {
            throw new PharmacyNotFound("Pharmacy is null");
        }
        if (pharmacy.getAddress() == null || pharmacy.getAddress().isEmpty()) {
            throw new PharmacyNotFound("Pharmacy address is null");
        }
        if (pharmacy.getName() == null || pharmacy.getName().isEmpty()) {
            throw new PharmacyNotFound("Pharmacy name is null");
        }
        if (pharmacy.getID() == 0) {
            throw new PharmacyNotFound("Pharmacy ID is null");
        }
        if (id == 0) {
            throw new PharmacyNotFound("Pharmacy ID is null");
        }
        pharmacyDaoImpl.update(id, pharmacy);
        System.out.println("Pharmacy updated successfully");
        return true;
    }

    @Override
    public boolean deleteById(long id) throws PharmacyNotFound {
        if (id == 0) {
            throw new PharmacyNotFound("Pharmacy ID is null");
        }
        pharmacyDaoImpl.deleteById(id);
        return true;
    }
}
