package Module4Homework;


public abstract class Bank {
    long id;
    String bankCountry;
    Currency currency;
    int numberOfEmployees;
    double avrSalaryOfEmployee;
    long rating;
    long totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;

    }
    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int summ);

    abstract double moneyPaidMonthlyForSalary();


    public long getId() {
        return id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public Bank setId(long id) {
        this.id = id;
        return this;
    }

    public Bank setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
        return this;
    }

    public Bank setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Bank setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        return this;
    }

    public Bank setRating(long rating) {
        this.rating = rating;
        return this;
    }

    public Bank setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
        return this;
    }

}
