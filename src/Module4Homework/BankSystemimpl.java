package Module4Homework;


public class BankSystemimpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
            Bank userBank = user.getBank();

            if (userBank.getLimitOfWithdrawal()>=amount){
                user.setBalance(user.getBalance()-amount-userBank.getCommission(amount)*(amount/100));
            }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfWithdrawal()>=amount){
            user.setBalance(user.getBalance()+amount-amount*(userBank.getCommission(amount)/100));
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank toUserBank=toUser.getBank();
        Bank fromUserBank=fromUser.getBank();
       // if ()


    }

    @Override
    public void paySalary(User user) {

    }
}
