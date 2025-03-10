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
        int scanRooms = scanner.nextInt();
        printByRooms(scanRooms);
        System.out.print("Квартири з кількістю кімнат: ");
        int newScanRooms = scanner.nextInt();
        System.out.print("та на поверсі більше ніж: ");
        int scanFloor = scanner.nextInt();
        printByRoomsAndFloorsInRange(newScanRooms, scanFloor);
        System.out.print("Квартири з площею: ");
        double scanArea = scanner.nextDouble();
        printByArea(scanArea);
    }

    public static void printByRooms(int scanRooms) {
        for (Apartment apartment : apartments) {
            if (apartment.getRooms() == scanRooms) {
                System.out.println("По кількості кімнат: " + apartment);
            }
        }
    }
    public static void printByRoomsAndFloorsInRange(int newScanRooms, int scanFloor) {
        for (Apartment apartment : apartments) {
            if (apartment.getRooms() == newScanRooms && apartment.getFloor() >= scanFloor) {
                System.out.println("По кімнатам та поверху: " + apartment);
            }
        }
    }
    public static void printByArea(double scanArea) {
        for (Apartment apartment : apartments) {
            if (apartment.getArea() > scanArea) {
                System.out.println("По площі: " + apartment);
            }
        }
    }
}