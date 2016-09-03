package module2.homework;
public class HomeTask24 {
    private static int[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    private static double fundBalance(String ownerName, double fund) {
        int i = 0;
        double Afterwithdrawal = 0;
        for (i = 0; i<ownerNames.length; i++) {//перебираем юзеров
            if (ownerNames[i].equals(ownerName)) {//если совпадает, то...
                Afterwithdrawal = balances[i] + fund;
                break;
            }
        }
        return Afterwithdrawal;
    }
    public static void main(String[] args) {
        String ownerName3 = "Oww";
        double withdrawal3 = 100;
        double fundBalance3 = fundBalance(ownerName3, withdrawal3);
        String formattedFundBalance3 = String.format("%.0f", fundBalance3);
        if (fundBalance3 >= 0) {
            System.out.println(ownerName3 + " " + formattedFundBalance3);
        } else {
            System.out.println(ownerName3 + " No");
        }
    }
}



