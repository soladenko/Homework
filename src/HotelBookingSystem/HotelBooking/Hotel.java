package HotelBookingSystem.HotelBooking;


import java.util.List;

public class Hotel extends IndexEntity {
    private String hotelName;
    private String hotelCity;
    private List<Room> hotelRooms;


    public Hotel(long hotelId, String hotelName, String hotelCity, List<Room> hotelRooms) {

        this.setId(hotelId);
        this.hotelName = hotelName;
        this.hotelCity = hotelCity;
        this.hotelRooms = hotelRooms;

    }
    public String getName() {
        return hotelName;

    }

    public String getCity() {
        return hotelCity;

    }

    public List<Room> getHotelRooms() {
        return hotelRooms;

    }

    @Override
    public String toString() {
        return "\nHotel{" +
                "hotelId=" + this.getId() +
                ", hotelName='" + hotelName + '\'' +
                ", hotelCity='" + hotelCity + '\'' +
                ", hotelRooms=" + hotelRooms +
                '}';

    }
    public String hotelToString() {
        return "Hotel{" +
                "hotelId=" + this.getId() +
                ", hotelName='" + hotelName + '\'' +
                ", hotelCity='" + hotelCity +
                '}';
    }
}
