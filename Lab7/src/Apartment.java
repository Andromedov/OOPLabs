public class Apartment extends Property implements Comparable<Apartment> {
    private Double area;
    private Integer rooms;
    private static Integer counter = 0;

    public Apartment() {
        super();
        this.area = 0.0;
        this.rooms = 1;
    }

    public Apartment(Integer number, Double area) {
        super(++counter, number, 1, "");
        this.area = area;
        this.rooms = 1;
    }

    public Apartment(Integer number, Double area, Integer rooms) {
        super(++counter, number, 1, "");
        this.area = area;
        this.rooms = rooms;
    }

    public Apartment(Integer id, Integer number, Double area, Integer floor, Integer rooms, String street) {
        super(id, number, floor, street);
        this.area = area;
        this.rooms = rooms;
        counter++;
    }

    public Apartment(Apartment other) {
        super(other);
        this.area = other.area;
        this.rooms = other.rooms;
        counter++;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    @Override
    public String getPropertyType() {
        return "Apartment";
    }

    @Override
    public String toString() {
        return "Apartment{" +
                super.toString() +
                ", area=" + area +
                ", rooms=" + rooms +
                '}';
    }

    @Override
    public int compareTo(Apartment other) {
        return this.area.compareTo(other.area);
    }
}