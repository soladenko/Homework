package HotelBookingSystem.HotelBooking;


public class User extends IndexEntity {
    private String firstName;
    private String lastName;
    private boolean userRegistered;

    public User(long userId, String firstName, String lastName) {
        this.setId(userId);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setUserRegistered(boolean userRegistered) {
        this.userRegistered = userRegistered;
    }

    public boolean isUserRegistered() {
        return userRegistered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (this.getId() != user.getId()) return false;
        if (userRegistered != user.userRegistered) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        return lastName != null ? lastName.equals(user.lastName) : user.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (this.getId() ^ (this.getId() >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (userRegistered ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + this.getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userRegistered=" + userRegistered +
                '}';
    }
}
