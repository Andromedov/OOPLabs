public class Apartment {
    private int id;
    private int number;
    private double quarters;
    private int floor;
    private int rooms;
    private String street;

    public Apartment(int id, int number, double area, int floor, int rooms, String street) {
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Apartment [id=" + id + ", number=" + number + ", area=" + area + ", floor=" + floor + ", rooms=" + rooms
                + ", street=" + street + "]";
    }
}
