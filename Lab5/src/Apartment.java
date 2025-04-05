public class Apartment {
    private Integer id;
    private Integer number;
    private Double area;
    private Integer floor;
    private Integer rooms;
    private String street;
    private static Integer counter = 0;

    public Apartment() {
        this.id = ++counter;
        this.number = 1;
        this.area = 0.0;
        this.floor = 1;
        this.rooms = 1;
        this.street = "";
    }
    public Apartment(Integer number, Double area) {
        this.id = ++counter;
        this.number = number;
        this.area = area;
        this.floor = 1;
        this.rooms = 1;
        this.street = "";
    }
    public Apartment(Integer number, Double area, Integer rooms) {
        this.id = ++counter;
        this.number = number;
        this.area = area;
        this.floor = 1;
        this.rooms = rooms;
        this.street = "";
    }
    public Apartment(Integer id, Integer number, Double area, Integer floor, Integer rooms, String street) {
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        counter++;
    }
    public Apartment(Apartment other) {
        this.id = ++counter;
        this.number = other.number;
        this.area = other.area;
        this.floor = other.floor;
        this.rooms = other.rooms;
        this.street = other.street;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", number=" + number +
                ", area=" + area +
                ", floor=" + floor +
                ", rooms=" + rooms +
                ", street='" + street + '\'' +
                '}';
    }
}