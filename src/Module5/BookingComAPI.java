package Module5;

public class BookingComAPI implements API {
    private Room[] rooms;


    public BookingComAPI() {
        Room room1 = new Room(100, 2, "Kiyv");
        rooms[0] = room1;
        Room room2 = new Room(200, 2, "Lviv");
        rooms[0] = room2;
        Room room3 = new Room(300, 2, "Dnepr");
        rooms[0] = room3;
        Room room4 = new Room(400, 2, "Odessa");
        rooms[0] = room4;
        Room room5 = new Room(500, 2, "Chernigiv");
        rooms[0] = room5;

    }

    @Override
    public Room[] findRooms(int price, int persons, String cityName, String hotelName) {
        Room founndRoom[] = new Room[5];
        int count = 0;
        for (Room item : rooms) {
            boolean founndRoom1 = item.getPrice() == price && item.getPersons() == persons;
            boolean founndRoom2 = item.getCityName() == cityName && item.getHotelName() == hotelName;
            if (founndRoom1 = founndRoom2) {
                founndRoom[count] = item;
                count++;
            }
        }
        return founndRoom;
    }
    public Room[]getRooms() {
     return rooms;
    }

}

