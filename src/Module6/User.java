package Module6;


public class User {
    private long ID;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    public User(long ID, String firstName, String lastName, int salary, int balance) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;


    }

    User() {

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
            if (!(obj instanceof User))
                return false;



            User user = (User) obj;

            if (ID != user.ID)
                return false;
            if (salary != user.salary)
                return false;
            if (balance != user.balance)
                return false;
            if (!firstName.equals(user.firstName))
                return false;
            return lastName.equals(user.lastName);

        }


        @Override
        public int hashCode () {
            int result = (int) (ID ^ (ID >>> 32));
            result = 31 * result + firstName.hashCode();
            result = 31 * result + salary;
            result = 31 * result + balance;
            return result;
        }


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", balance=" + balance +
                '}';
    }
}


