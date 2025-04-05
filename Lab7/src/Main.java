import java.util.*;
import static java.lang.Math.*;

public class Main {
    private static Property[] properties = new Property[4];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Apartment[] apartments = new Apartment[10];
        HotelRoom[] hotelRooms = new HotelRoom[10];

        apartments[0] = new Apartment(1, 101, 45.5, 3, 2, "Вулиця 1");
        apartments[1] = new Apartment(2, 102, 50.0, 4, 3, "Вулиця 2");
        apartments[2] = new Apartment(3, 103, 38.2, 2, 1, "Вулиця 3");
        apartments[3] = new Apartment(4, 104, 60.7, 5, 3, "Вулиця 4");
        apartments[4] = new Apartment(5, 105, 42.3, 1, 2, "Вулиця 5");
        apartments[5] = new Apartment(6, 106, 55.4, 3, 2, "Вулиця 6");
        apartments[6] = new Apartment(7, 107, 47.1, 6, 1, "Вулиця 6");
        apartments[7] = new Apartment(8, 108, 63.0, 7, 4, "Вулиця 2");
        apartments[8] = new Apartment(9, 109, 49.8, 2, 2, "Вулиця 3");
        apartments[9] = new Apartment(10, 110, 52.6, 4, 3, "Вулиця 1");

        hotelRooms[0] = new HotelRoom(1, 101, 2, 2, "Вулиця 1");
        hotelRooms[1] = new HotelRoom(2, 102, 3, 3, "Вулиця 2");
        hotelRooms[2] = new HotelRoom(3, 103, 1, 1, "Вулиця 3");
        hotelRooms[3] = new HotelRoom(4, 104, 4, 4, "Вулиця 4");
        hotelRooms[4] = new HotelRoom(5, 105, 2, 2, "Вулиця 6");
        hotelRooms[5] = new HotelRoom(6, 106, 3, 3, "Вулиця 5");
        hotelRooms[6] = new HotelRoom(7, 107, 1, 1, "Вулиця 6");
        hotelRooms[7] = new HotelRoom(8, 108, 5, 5, "Вулиця 5");
        hotelRooms[8] = new HotelRoom(9, 109, 2, 2, "Вулиця 3");
        hotelRooms[9] = new HotelRoom(10, 110, 3, 3, "Вулиця 2");

        System.out.println("Apartments сортовані по площі:");
        Arrays.sort(apartments);
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }

        System.out.println("\nHotelRooms сортовані по кімнатам:");
        Arrays.sort(hotelRooms);
        for (HotelRoom room : hotelRooms) {
            System.out.println(room);
        }

        System.out.println("\nApartments спершу за кімнатами, а після вулицею:");
        Arrays.sort(apartments, new Comparator<Apartment>() {
            @Override
            public int compare(Apartment apart1, Apartment apart2) {
                int roomCompare = apart1.getRooms().compareTo(apart2.getRooms());
                if (roomCompare != 0) {
                    return roomCompare;
                }
                return apart1.getStreet().compareTo(apart2.getStreet());
            }
        });
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }

        System.out.println("\nHotelRooms спершу по вулиці, а після по кімнат:");
        Arrays.sort(hotelRooms, new Comparator<HotelRoom>() {
            @Override
            public int compare(HotelRoom hotel1, HotelRoom hotel2) {
                int streetCompare = hotel1.getStreet().compareTo(hotel2.getStreet());
                if (streetCompare != 0) {
                    return streetCompare;
                }
                return hotel1.getRoomCount().compareTo(hotel2.getRoomCount());
            }
        });
        for (HotelRoom room : hotelRooms) {
            System.out.println(room);
        }
    }
}