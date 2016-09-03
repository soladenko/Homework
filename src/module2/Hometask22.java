package module2.homework;
public class Hometask22 {
    public static void main(String[] args) {// метод main
        //comission=5%
        double balance = 100;
        double withdrawal = 10;
        //double withdrawal = 99;
        double AfterWithdrawal = withdrawal*5/100;

        double balanceAfter = (balance-withdrawal-AfterWithdrawal);
        if (balanceAfter >= 0) {
            System.out.println("ok" +" "+ AfterWithdrawal+" "+balanceAfter);

        } else {
            System.out.println("no");
        }
    }
}

















