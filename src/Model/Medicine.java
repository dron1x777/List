package Model;

import java.time.LocalDate;

public class Medicine {
    private String medicineName;
    private int price;
    private String description;
    private LocalDate expirationDate;
    private long ID;
    private long counter;

    public Medicine(String medicineName, int price, String description, LocalDate expirationDate) {
        this.medicineName = medicineName;
        this.price = price;
        this.description = description;
        this.expirationDate = expirationDate;
        this.ID = ++counter;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
