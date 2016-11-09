package HotelBookingSystem.HotelBooking;


public class UserDAO extends AbstractDAOImpl<User> {
    private static UserDAO instance;
    private UserDAO() {
    }
    public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }
}
