package Module4Homework;


public class Main {
    public static void main(String[] args, Bank ChinaBank2, Bank ChinaBank1, Bank EUBank2, Bank EUBank1, Bank USBank2, Bank USBank1) {
        Bank bank1=new USBank(1234,"USA",Currency.USD,100,1000,20,10000000);
        Bank bank2=new USBank(2345, "USA", Currency.USD, 50, 2000, 10, 10000000);
        Bank bank3=new EUBank(3456, "EU", Currency.EUR, 10, 500, 50, 8000000);
        Bank bank4=new EUBank(4567, "EU", Currency.EUR, 30, 800, 30, 8000000);
        Bank bank5=new ChinaBank(5678,"CHINA",Currency.USD, 40,700,70,90000000);
        Bank bank6=new ChinaBank(5678,"CHINA",Currency.USD, 40,700,70,90000000);

        User user1=new User(123,"Alex",50000.0,20,"Huawey",7000,USBank1);
        User user2=new User(234,"Steve",60000.0,30,"ZTE",8000,USBank2);
        User user3=new User(345,"Mark",70000.0,40,"Erricson",9000,EUBank1);
        User user4=new User(456,"Ted",80000.0,50,"Nokia",10000,EUBank2);
        User user5=new User(567,"Nick",90000.0,60,"Emerson",11000,ChinaBank1);
        User user6=new User(678,"Tom",40000.0,70,"Siemens",12000,ChinaBank2);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);

        BankSystemimpl bankSystemimpl=new BankSystemimpl();
        bankSystemimpl.withdrawOfUser(user1,100);
        bankSystemimpl.fundUser(user2,500);
        bankSystemimpl.transferMoney(user1,user2,100);
        bankSystemimpl.paySalary(user5);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);

    }
}
