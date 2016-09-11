package Module4Homework;


public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;

    }

    @Override
    int getLimitOfFunding() {
            int funding;
            if (getCurrency()==Currency.USD) funding=10000;
            else funding=20000;
            return funding;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD) rate = 0;
        else rate = 1;
        return rate;

    }

    @Override
    int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        } else {
            if (amount < 1000) commission = 2;
            else commission = 4;
            return 0;
        }
        return commission;

    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return getAvrSalaryOfEmployee()*getNumberOfEmployees();
    }
}
