package Module4Homework;


public class BankSystemimpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank=user.getBank();
        double comission=userBank.getCommission(amount)/100;
        if ( userBank.getLimitOfWithdrawal()>=amount+amount*comission);
        double newBalance=user.getBalance()-amount-amount*comission;
        user.setBalance(newBalance);
        }




    @Override
    public void fundUser(User user, int amount) {
         Bank userBank=user.getBank();
         if (userBank.getLimitOfFunding()>=amount);
         user.setBalance(user.getBalance()+amount-amount*userBank.getCommission(amount)/100);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
          Bank toUserBank = toUser.getBank();
          Bank fromUserBank=fromUser.getBank();
        if (toUserBank.getLimitOfFunding()>=amount);
        toUser.setBalance(toUser.getBalance()+amount);
        if (fromUserBank.getLimitOfWithdrawal()>=amount);
        fromUser.setBalance(fromUser.getBalance()-amount-fromUserBank.getCommission(amount));
        }



    @Override
    public void paySalary(User user) {
        Bank userBank=user.getBank();
        if (userBank.getLimitOfFunding()>=user.getSalary());
        user.setBalance(user.getBalance()+user.getSalary());

    }
}
