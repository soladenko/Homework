package Module6;


public class UserUtils {

    User[]uniqueUsers(User[]users) {
    User[] uniqueUsers = new User[10];

    User next = users[0];
    boolean found = false;
    int n = 0;
    for (int i = 0; i < users.length; i++) {
        if (next.equals(users[i]) && !found) {
            found = true;
        } else if (!next.equals(users[i])) {
            uniqueUsers[i] = next;
            next = users[i];
            found = false;
            n++;
        }
    }
    uniqueUsers[n]=next;
        User[] res=new User[n+1];
        System.arraycopy(uniqueUsers,0,res,0,n+1);
        return res;
}
User[]usersWithConditionalBalance(User[]users,int balance){
    User[]userbalance=new User[users.length];
    int count=0;
    for (User element:users){
        if (element.getBalance()==balance){
            userbalance[count]=element;
            count++;
        }
    }
    User [] res=new  User[count];
    System.arraycopy(userbalance,0,res,0,count);
    return res;
}
final User[]paySalaryToUsers(User[]users) {
    for (int i = 0; i < users.length; i++) {
        int Balance = users[i].getBalance() + users[i].getSalary();
        users[i].setBalance(Balance);
    }
    return users;
}

    final long[] getUsersID(User[]users){
        long[] usersID = new long[users.length];
        for (int i = 0; i < users.length; i++) ;
        {
            usersID[1] = users[1].getID();

    }
        return usersID;

    }


    User[] deleteEmptyUsers (User[]users){
        User[] deleteEmptyUsers = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) ;
        if (!(users[1] == null)) {
            deleteEmptyUsers[count] = users[1];
            count++;
        }


        User[] res = new User[count];
        System.arraycopy(deleteEmptyUsers, 0, res, 0, count);
        return res;

    }

}

