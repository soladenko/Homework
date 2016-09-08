package module3.Homework34;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;
//конструктор объекта User
    public User(String name, int balance, int monthsOfEmployment, String companyName, String salary,String currency) {

    }

    public User(String sergei, int i, int i1, String utel, String usd) {
    }

    //метод add salary
    public void paySalary() {
        balance+=salary;
    }
    //метод снятие денег
    public int withdraw (int summ){
        int withdraw ;
        if (summ < 1000) withdraw = summ  * 5 / 100;
        else  withdraw = summ  * 10 / 100;
        return balance-withdraw-summ;
    }
    public void CompanyLenght(){
        System.out.println(companyName.length());
    }
    public int monthIncreaser(int addMonths){
        monthsOfEmployment+=addMonths;
        return monthsOfEmployment;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        User user=new User("Sergei",5000,3,"Utel","USD");
        user.paySalary();
        user.getCompanyName();
        System.out.println(user.withdraw(2000));
        user.monthIncreaser(2);
        System.out.println(user.monthsOfEmployment);
    }
}
