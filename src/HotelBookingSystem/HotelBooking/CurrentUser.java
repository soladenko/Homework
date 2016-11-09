package HotelBookingSystem.HotelBooking;


public class CurrentUser {
    private User curUser;

    public User getCurrentUser() {
        return curUser;

    }

    public void setCurrentUser(User currentUser) {
        System.out.println("\nCurrent user is " + currentUser);
        this.curUser = currentUser;

    }
}
