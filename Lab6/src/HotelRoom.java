public class HotelRoom extends Property {
    private Integer roomCount;

    public HotelRoom() {
        super();
        this.roomCount = 1;
    }

    public HotelRoom(Integer id, Integer roomNumber, Integer floor, Integer roomCount, String street) {
        super(id, roomNumber, floor, street);
        this.roomCount = roomCount;
    }

    public HotelRoom(HotelRoom other) {
        super(other);
        this.roomCount = other.roomCount;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public String getPropertyType() {
        return "HotelRoom";
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                super.toString() +
                ", roomCount=" + roomCount +
                '}';
    }
}