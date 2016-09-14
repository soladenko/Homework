package Module4Homework;


public  class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int funding;
        if (getCurrency()==Currency.USD) funding=0;
        else funding=10000;
        return funding;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD) rate = 1;
        else rate = 2;
        return rate;


    }

    @Override
    int getCommission(int amount) {
            int commission;
            if (getCurrency() == Currency.USD) {
                if (amount < 1000) commission = 5;
                else commission = 7;
            } else {
                if (amount < 1000) commission = 6;
                else commission = 8;
                return 0;
            }
            return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return getAvrSalaryOfEmployee()*getNumberOfEmployees();
    }
}





