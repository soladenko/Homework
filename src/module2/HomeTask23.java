
package module2.homework;

    public class HomeTask23 {

            private static int[] balances = {1200, 250, 2000, 500, 3200};
            private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

            private static double withdrawBalance(double balance, double withdrawal) {// переменная снятия денег с комиссией
                // комиссия 5%
                return balance - withdrawal - withdrawal * 0.05;
            }
            private static double withdrawBalance(String ownerName, double withdrawal) {// переменная баланса снтия овнеров
                int i = 0;
                double result = 0;
                for (i = 0; i<ownerNames.length; i++) {//перебираем юзеров
                    if (ownerNames[i].equals(ownerName)) {//если совпадает, то...
                        result = balances[i] - withdrawal - withdrawal * 0.05;
                        break;
                    }

                }
                return result;
            }
            public static void main(String[] args) {

                String ownerName1 = "Ann";
                double withdrawal0 = 100;
                double withdrawBalance0 = withdrawBalance(ownerName1, withdrawal0);
                String formattedWithdrawBalance0 = String.format("%.0f", withdrawBalance0);
                if (withdrawBalance0 >= 0) {
                    System.out.println(ownerName1 + " " + String.format("%.0f", withdrawal0) + " " + formattedWithdrawBalance0);
                } else {
                    System.out.println(ownerName1 + " No");
                }

                String ownerName2 = "Oww";
                double withdrawal1 = 490;
                double withdrawBalance1 = withdrawBalance(ownerName1, withdrawal1);
                String formattedWithdrawBalance1 = String.format("%.0f", withdrawBalance1);
                if (withdrawBalance1 >= 0) {
                    System.out.println(ownerName2 + " " + String.format("%.0f", withdrawal1) + " " + formattedWithdrawBalance1);
                } else {
                    System.out.println(ownerName2 + " No");
                }
                System.out.println();


            }
        }