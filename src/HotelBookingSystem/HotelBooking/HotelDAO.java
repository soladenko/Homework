package HotelBookingSystem.HotelBooking;


import java.util.*;
import java.util.stream.Collectors;

import static HotelBookingSystem.HotelBooking.Utils.printMessage;

public class HotelDAO extends AbstractDAOImpl<Hotel> {
    private static HotelDAO instance;

    public static HotelDAO getInstance() {
        if (instance == null) {
            instance = new HotelDAO();
        }
        return instance;
    }
    private HotelDAO() {
        List<List<Room>> roomLists = new ArrayList<>();
        for (int j = 0; j < 6; j++) {

            List<Room> roomsHotel = new ArrayList<>();
            for (int i = 1; i < 11; i++) {
                roomsHotel.add(new Room(i + j * 10, i % 4 + 1, (i % 4 + 1) * 50 + 100 + (j % 3) * 30));
            }
            roomLists.add(roomsHotel);
        }
        this.save(new Hotel(1, "Radisson Hotel","Kiev", roomLists.get(0)));
        this.save(new Hotel(2, "Hyatt Regency Hotel","Kiev",roomLists.get(1)));
        this.save(new Hotel(3, "Leopolis Hotel","Lvov",roomLists.get(2)));
        this.save(new Hotel(4, "Nobilis Hotel","Lvov",roomLists.get(3)));
        this.save(new Hotel(5, "Duke Hotel Odessa","Odessa",roomLists.get(4)));
        this.save(new Hotel(6, "Bristol Hotel","Odessa",roomLists.get(5)));
    }

    public List<Hotel> getByCity(String city) {
        return this.getAll().stream()
                .filter(hotel -> hotel.getCity().toLowerCase().contains(city.toLowerCase()))
                .collect(Collectors.toList());

    }
    public List<Hotel> getByName(String name) {
        return this.getAll().stream()
                .filter(hotel -> hotel.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    private Room getRoomById(long hotelId, long roomId) {
        Hotel hotel = getById(hotelId);
        if (hotel != null) {
            for (Room room : hotel.getHotelRooms()) {
                if (room.getId() == roomId) {
                    return room;
                }
            }
        } else {
            printMessage("Hotel is not found in the system by id = " + hotelId + "! Please, enter another hotel!");

        }
        return null;
    }
    public boolean bookRoom(User user, long hotelId, long roomId) {
        if (checkUserHotelRoom(user, hotelId, roomId)) {
            Room room = getRoomById(hotelId, roomId);
            if (room != null) {
                room.setUserReserved(user);
                return true;
            }
        }
        return false;
    }
    public boolean cancelRoomReservation(User user, long hotelId, long roomId) {
        if (checkUserHotelRoom(user, hotelId, roomId)) {
            Room room = getRoomById(hotelId, roomId);
            if (room == null) {
                printMessage("We can't find room with id = " + roomId + " to remove reservation!");
                return false;

            }
            if (user.equals(room.getUserReserved())) {
                room.setUserReserved(null);
                printMessage("Reservation removed from room with id = " + roomId);
                return true;
            } else {
                printMessage(user + " did not reserve the room in this hotel '" + getById(hotelId).getName() + "'! Please, try with another user!");
            }
        }
        return false;
    }

    private boolean checkUserHotelRoom(User user, long hotelId, long roomId) {
        if (user == null) {
            printMessage("User is not found in the system! Please, register user in the system!");
            return false;
        }
        if (!user.isUserRegistered()) {
            printMessage("User is not registered in the system! Please, register user in the system!");
            return false;
        }
        Hotel hotel = getById(hotelId);
        if (hotel == null) {
            printMessage("Hotel is not found in the system by id = " + hotelId + "! Please, enter another hotel!");
            return false;
        }
        if (getRoomById(hotelId, roomId) == null) {
            printMessage("Room is not found in hotel '" + hotel.getName() + "' by id = " + roomId + "! Please, enter another room id!");
            return false;
        }
        return true;
    }
    //Select hotels with given city and hotel name. If city or hotel name is null filter returns all hotels.
    // If only one parameter given another parameter is ignored by true value in ternary operator
    public Map<Hotel, List<Room>> getRooms(String city, String hotelName, double price, int persons) {
        Map<Hotel, List<Room>> resultHotelMap = getHotelMap(city, hotelName);
        for (Map.Entry<Hotel, List<Room>> entry : resultHotelMap.entrySet()) {
            entry.getValue().addAll(
                    entry.getKey().getHotelRooms().stream()
                            .filter(room -> ((persons > 0 ? room.getPersons() == persons : true) &&
                                    (price > 0 ? room.getPrice() == price : true)))
                            .sorted((room1, room2) -> Double.compare(room1.getPrice(), room2.getPrice()))
                            .collect(Collectors.toList()));
        }
        Iterator iterator = resultHotelMap.values().iterator();
        while (iterator.hasNext()) {
            if (((List<Room>) iterator.next()).size() == 0){
                iterator.remove();
            }
        }
        return resultHotelMap;
    }

    public Map<Hotel, List<Room>> getHotelMap(String city, String hotelName) {
        Map<Hotel, List<Room>> resultHotelMap = new HashMap<>();
        getAll().stream()
                .filter(hotel -> ((city != null && city.length() > 2) ? hotel.getCity().toLowerCase().contains(city.toLowerCase()) : true) &&
                        ((hotelName != null && hotelName.length() > 2) ? hotel.getName().toLowerCase().contains(hotelName.toLowerCase()) : true))
                .sorted((hotel1, hotel2) -> hotel1.getName().compareTo(hotel2.getName()))
                .forEach(hotel -> resultHotelMap.put(hotel, new ArrayList<>()));
        return resultHotelMap;
    }
}
