public abstract class Property {
    private Integer id;
    private Integer number;
    private Integer floor;
    private String street;

    public Property() {
        this.id = 0;
        this.number = 0;
        this.floor = 1;
        this.street = "";
    }

    public Property(Integer id, Integer number, Integer floor, String street) {
        this.id = id;
        this.number = number;
        this.floor = floor;
        this.street = street;
    }

    public Property(Property other) {
        this.id = other.id;
        this.number = other.number;
        this.floor = other.floor;
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

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public abstract String getPropertyType();

    @Override
    public String toString() {
        return "id=" + id +
                ", number=" + number +
                ", floor=" + floor +
                ", street='" + street + '\'';
    }
}