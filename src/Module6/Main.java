package Module6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[]users=new User[1];
        users[0]= new User(1111, "Sergey", "Oladenko", 1000, 5000);

        UserUtils userUtils=new UserUtils();
        loop(userUtils.uniqueUsers(users));
        loop(userUtils.deleteEmptyUsers(users));
        loop(userUtils.paySalaryToUsers(users));
        loop(userUtils.usersWithConditionalBalance(users,1000));


    }
    private static void loop(User[] users) {
        for (User elements : users) {
            System.out.println(elements);
        }
        System.out.println();
    }

}
