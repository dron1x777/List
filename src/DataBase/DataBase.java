package DataBase;

import Model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Pharmacy> pharmacies = new ArrayList<>();


    public void setPharmacies1(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }
    public List<Pharmacy> getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(Pharmacy pharmacy) {
        this.pharmacies.add(pharmacy);
    }
    public void deletePharmacy(Pharmacy pharmacy) {
        this.pharmacies.remove(pharmacy);
    }
}
