import java.util.*;
import static java.lang.Math.*;

public class Main {
    private static Property[] properties = new Property[4];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HotelRoom hotelRoom = new HotelRoom(1, 101, 2, 2, "Hotel Street");
        System.out.println("Hotel Room: " + hotelRoom);

        Apartment apt = new Apartment(1, 103, 38.2, 2, 2, "Apartment Street");
        System.out.println("Apartment: " + apt);

        properties[0] = new Apartment(1, 101, 45.5, 3, 2, "Central Street");
        properties[1] = new HotelRoom(2, 102, 2, 3, "Hotel Avenue");
        properties[2] = new Apartment(3, 103, 38.2, 2, 1, "Blue Street");
        properties[3] = new HotelRoom(4, 104, 4, 2, "Resort Road");

        System.out.println("\nУсе майно:");
        for (Property property : properties) {
            System.out.println(property.getPropertyType() + ": " + property);
        }
    }
}