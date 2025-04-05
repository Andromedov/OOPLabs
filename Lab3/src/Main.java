import java.util.*;
import static java.lang.Math.*;

public class Main {
    private static Apartment[] apartments = new Apartment[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        apartments[0] = new Apartment(1, 101, 45.5, 3, 2, "Вулиця Центральна");
        apartments[1] = new Apartment(2, 102, 50.0, 4, 3, "Вулиця Зелена");
        apartments[2] = new Apartment(3, 103, 38.2, 2, 1, "Вулиця Синя");
        apartments[3] = new Apartment(4, 104, 60.7, 5, 3, "Проспект Парковий");
        apartments[4] = new Apartment(5, 105, 42.3, 1, 2, "Вулиця Дубова");
        apartments[5] = new Apartment(6, 106, 55.4, 3, 2, "Вулиця Соснова");
        apartments[6] = new Apartment(7, 107, 47.1, 6, 1, "Бульвар Західний");
        apartments[7] = new Apartment(8, 108, 63.0, 7, 4, "Вулиця Річкова");
        apartments[8] = new Apartment(9, 109, 49.8, 2, 2, "Вулиця Вербова");
        apartments[9] = new Apartment(10, 110, 52.6, 4, 3, "Вулиця Кленова");

        System.out.print("Квартири з кількістю кімнат: ");
        Integer scanRooms = Integer.parseInt(scanner.next());
        printByRooms(scanRooms);
        System.out.print("Квартири з кількістю кімнат: ");
        Integer newScanRooms = Integer.parseInt(scanner.next());
        System.out.print("та на поверсі більше ніж: ");
        Integer minScanFloor = Integer.parseInt(scanner.next());
        System.out.print("та менше ніж: ");
        Integer maxScanFloor = Integer.parseInt(scanner.next());
        printByRoomsAndFloorsInRange(newScanRooms, minScanFloor, maxScanFloor);
        System.out.print("Квартири з площею: ");
        Double scanArea = Double.parseDouble(scanner.next());
        printByArea(scanArea);
    }

    public static void printByRooms(Integer scanRooms) {
        for (Apartment apartment : apartments) {
            if (apartment.getRooms().equals(scanRooms)) {
                System.out.println("По кількості кімнат: " + apartment);
            }
        }
    }
    public static void printByRoomsAndFloorsInRange(Integer newScanRooms, Integer minScanFloor, Integer maxScanFloor) {
        for (Apartment apartment : apartments) {
            if (apartment.getRooms().equals(newScanRooms) && apartment.getFloor().compareTo(minScanFloor) >= 0 && apartment.getFloor().compareTo(maxScanFloor) <= 0) {
                System.out.println("По кімнатам та поверху: " + apartment);
            }
        }
    }
    public static void printByArea(Double scanArea) {
        for (Apartment apartment : apartments) {
            if (apartment.getArea().compareTo(scanArea) >= 0) {
                System.out.println("По площі: " + apartment);
            }
        }
    }
}