package Dao.Impl;

import Dao.PharmacyDao;
import DataBase.DataBase;
import Model.Employee;
import Model.Medicine;
import Model.Pharmacy;

import java.sql.SQLOutput;
import java.util.List;

public class PharmacyDaoImpl implements PharmacyDao {
    DataBase db = new DataBase();

    @Override
    public void add(Pharmacy pharmacy) {
        db.getPharmacies().add(pharmacy);
    }

    @Override
    public Pharmacy getById(long id) {
        for (Pharmacy pharmacy : db.getPharmacies()) {
            if (pharmacy.getID() == id) {
                System.out.println(pharmacy.getName() + " " + pharmacy.getAddress() + " " + pharmacy.getID());
                return pharmacy;
            }
        }
        return null;
    }

    @Override
    public List<Pharmacy> getAll() {
        return db.getPharmacies();
    }

    @Override
    public Pharmacy getByName(String name) {
        for (Pharmacy pharmacy : db.getPharmacies()) {
            if (pharmacy.getName().equals(name)) {
                System.out.println(pharmacy.getName() + " " + pharmacy.getAddress() + " " + pharmacy.getID());

                return pharmacy;
            }
        }
        return null;
    }

    @Override
    public Pharmacy getByAddress(String address) {
        for (Pharmacy pharmacy : db.getPharmacies()) {
            if (pharmacy.getAddress().equals(address)) {
                System.out.println(pharmacy.getName() + " " + pharmacy.getAddress() + " " + pharmacy.getID());

                return pharmacy;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeesByPharmacyId(long id) {
        for (Pharmacy pharmacy : db.getPharmacies()) {
            if (pharmacy.getID() == id) {
                return pharmacy.getEmployees();
            }
        }
        return null;
    }

    @Override
    public List<Medicine> getMedicinesByPharmacyId(long id) {
        for (Pharmacy pharmacy : db.getPharmacies()) {
            if (pharmacy.getID() == id) {
                return pharmacy.getMedicines();
            }
        }
        return null;
    }

    @Override
    public boolean update(long id, Pharmacy pharmacy) {
        for (Pharmacy pharmacy1 : db.getPharmacies()) {
            if (pharmacy1.getID() == id) {
                pharmacy1.setAddress(pharmacy.getAddress());
                pharmacy1.setID(pharmacy.getID());
                pharmacy1.setName(pharmacy.getName());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteById(long id) {
        for (Pharmacy pharmacy : db.getPharmacies()) {
            if (pharmacy.getID() == id) {
                db.deletePharmacy(pharmacy);
                System.out.println("Pharmacy has been deleted");
                return true;
            }
        }
        System.out.println("whatt?");
        return false;
    }
}
