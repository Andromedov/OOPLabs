public class Apartment {
    private int id;
    private int number;
    private double quarters;
    private int floor;
    private int rooms;
    private String street;

    public Apartment(int id, int number, double quarters, int floor, int rooms, String street) {
        this.id = id;
        this.number = number;
        this.quarters = quarters;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setQuarters(double quarters) {
        this.quarters = quarters;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public double getQuarters() {
        return quarters;
    }

    public int getFloor() {
        return floor;
    }

    public int getRooms() {
        return rooms;
    }

    public String getStreet() {
        return street;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Apartment{" +
                "id=" + id +
                ", number=" + number +
                ", quarters=" + quarters +
                ", floor=" + floor +
                ", rooms=" + rooms +
                ", street='" + street + '\'' +
                '}';
    }
}