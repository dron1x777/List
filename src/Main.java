import Dao.Impl.PharmacyDaoImpl;
import Model.Pharmacy;
import Service.Impl.PharmacyServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PharmacyServiceImpl pharmacyService = new PharmacyServiceImpl();
        Scanner sc = new Scanner(System.in);
        String pharmacyName = "";
        String pharmacyAddress = "";
        long pharmacyId = 0;
        while (true) {
            menu();
            System.out.print("enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Pharmacy name: ");
                     pharmacyName = sc.next();
                    System.out.println("Enter Pharmacy address: ");
                     pharmacyAddress = sc.next();
                    Pharmacy pharmacy = new Pharmacy(pharmacyName, pharmacyAddress);
                    pharmacyService.add(pharmacy);
                    break;
                case 2:
                    System.out.println("Enter Pharmacy name: ");
                    pharmacyName = sc.next();
                    pharmacyService.getByName(pharmacyName);
                    break;
                case 3:
                    System.out.println("Enter Pharmacy address: ");
                    pharmacyAddress = sc.next();
                    pharmacyService.getByAddress(pharmacyAddress);
                    break;
                case 4:
                    System.out.println("Enter Pharmacy ID: ");
                    pharmacyId = sc.nextInt();
                    pharmacyService.getEmployeesByPharmacyId(pharmacyId);
                    break;
                case 5:
                    System.out.println("Enter Pharmacy ID: ");
                    pharmacyId = sc.nextInt();
                    pharmacyService.getMedicinesByPharmacyId(pharmacyId);
                    break;
                case 6:
                    System.out.println("Enter Pharmacy ID: ");
                    pharmacyId = sc.nextInt();
                    System.out.println("Enter Pharmacy name: ");
                    pharmacyName = sc.next();
                    System.out.println("Enter Pharmacy address: ");
                    pharmacyAddress = sc.next();
                    Pharmacy pharmacy2 = new Pharmacy(pharmacyName, pharmacyAddress);
                    pharmacyService.update(pharmacyId,  pharmacy2);
                    break;
                case 7:
                    System.out.println("Enter Pharmacy ID: ");
                    pharmacyId = sc.nextInt();
                    pharmacyService.deleteById(pharmacyId);
                    break;
                case 8:
                    System.out.println("Enter Pharmacy ID: ");
                    pharmacyId = sc.nextInt();
                    pharmacyService.getById(pharmacyId);
                    break;
                case 9:
                    pharmacyService.getAll();
                    default:
                        System.out.println("Invalid choice");
                        break;
            }
        }
    }
    public static void menu() {
        System.out.println("""
                Welcome to the Pharmacy Management System!
                1. Добавить новую аптеку в базу
                2. Получить аптеку по названию
                3. Получить аптеку по адресу
                4. Получить список сотрудников конкретной аптеки
                5. Получить список лекарств конкретной аптеки
                6. Обновить данные аптеки (по ID внутри объекта)
                7. Удалить аптеку по ID
                8. Получить аптеку по уникальному ID
                9. Получить все аптеки
                """);
    }
}
