package HotelBookingSystem.HotelBooking;

public class Room extends IndexEntity {
    private int persons;
    private double price;
    private User userReserved;

    public Room(long roomId, int persons, double price) {
        this.setId(roomId);
        this.persons = persons;
        this.price = price;
    }

    public int getPersons() {
        return persons;

    }
    public double getPrice() {
        return price;
    }
    public void setUserReserved(User userReserved) {
        this.userReserved = userReserved;
    }
    public User getUserReserved() {
        return userReserved;
    }

    @Override
    public String toString() {
        return "\nRoom{" +
                "roomId=" + this.getId() +
                ", persons=" + persons +
                ", price=" + price +
                ", userReserved=" + userReserved +
                "}";
    }
}
