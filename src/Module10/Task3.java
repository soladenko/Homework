package Module10;


import Module4Homework.Bank;
import Module4Homework.USBank;
import Module4Homework.User;

public class Task3 extends Exception{

    public static void main(String[] args) {

        User user=null;
        try {
            user.getCompanyName();

        }catch (Throwable e){
            System.out.println("User isnt finding");

        }finally {

            user=new User(123,"User",10000,20,"Kiyvstar",1000);
            System.out.println(user);
        }
    }
}
