import java.util.*;
import static java.lang.Math.*;

public class Main {
    private static Property[] properties = new Property[4];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HotelRoom hotelRoom = new HotelRoom(1, 101, 2, 2, "Вулиця 1");
        System.out.println("HotelRoom: " + hotelRoom);

        Apartment apt = new Apartment(1, 103, 38.2, 2, 2, "Вулиця 2");
        System.out.println("Apartment: " + apt);

        properties[0] = new Apartment(1, 101, 45.5, 3, 2, "Вулиця 3");
        properties[1] = new HotelRoom(2, 102, 2, 3, "Вулиця 4");
        properties[2] = new Apartment(3, 103, 38.2, 2, 1, "Вулиця 5");
        properties[3] = new HotelRoom(4, 104, 4, 2, "Вулиця 6");

        System.out.println("\nУсе майно:");
        for (Property property : properties) {
            System.out.println(property.getPropertyType() + ": " + property);
        }
    }
}