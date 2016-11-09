package HotelBookingSystem.HotelBooking;


import java.util.List;
import java.util.Map;

import static HotelBookingSystem.HotelBooking.Utils.printMessage;

 public class Controller {

    private CurrentUser currentUser;
    private UserDAO userDAO = UserDAO.getInstance();
    private HotelDAO hotelDAO = HotelDAO.getInstance();

    public Controller() {
        this.currentUser = new CurrentUser();

    }

    public void setCurrentUser(CurrentUser currentUser) {
        this.currentUser = currentUser;

    }
    public User registerUser(User user) {
        user.setUserRegistered(true);
        return userDAO.save(user);

    }
    public List<Hotel> findHotelByName(String name) {
        return isUserRegistered() ? hotelDAO.getByName(name) : null;

    }

    public List<Hotel> findHotelByCity(String city) {
        return isUserRegistered() ? hotelDAO.getByCity(city) : null;

    }

    public boolean bookRoom(long roomId, long userId, long hotelId) {
        return isUserRegistered() && hotelDAO.bookRoom(userDAO.getById(userId), hotelId, roomId);

    }

    public boolean cancelReservation(long roomId, long userId, long hotelId) {
        return isUserRegistered() && hotelDAO.cancelRoomReservation(userDAO.getById(userId), hotelId, roomId);

    }
    //Example for map: city - Kiev, hotelName - Radisson, price - 200, persons - 2

    public Map<Hotel, List<Room>> findRoom (Map<String, String> params){

        String city;
        String hotelName;
        double price;
        int persons;

        if (!isUserRegistered()) {
            return null;

        }
        city = params.getOrDefault("city", null);

        hotelName = params.getOrDefault("hotelName", null);

        try {
            price = Double.valueOf(params.get("price"));
        } catch (NumberFormatException | NullPointerException e) {
            price = 0;
        }
        try {
            persons = Integer.parseInt(params.get("persons"));
        } catch (NumberFormatException | NullPointerException e) {
            persons = 0;
        }
        return hotelDAO.getRooms(city, hotelName, price, persons);
    }
    private boolean isUserRegistered() {
        User localCurrentUser = currentUser.getCurrentUser();
        boolean userRegistered = false;

        try {
            userRegistered = localCurrentUser.isUserRegistered();
        } catch (NullPointerException e) {
            printMessage("Try/Catch in isUserRegistered() method from the Controller class: NullPointerException! Current user is not set!");
            return userRegistered;
        }
        if (!userRegistered) {
            printMessage("Current user is not registered! Please, register user in the system! " + localCurrentUser);
        }
        return userRegistered;
    }
    public List<User> getAllUsers() {
        return isUserRegistered() ? userDAO.getAll() : null;
    }
    public List<Hotel> getAllHotels() {
        return isUserRegistered() ? hotelDAO.getAll() : null;
    }
    public Hotel getHotelById(long hotelId) {
        return isUserRegistered() ? hotelDAO.getById(hotelId) : null;
    }
}
