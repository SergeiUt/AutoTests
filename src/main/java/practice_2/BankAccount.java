package practice_2;

public class BankAccount {
    /*
     * Создайте класс BankAccount с полями owner и balance. Реализуйте конструктор, геттеры, сеттер для владельца,
     * методы deposit(amount) и withdraw(amount) и метод printBalance(). В main внесите деньги, снимите и выведите баланс.
     */
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println(owner + ": баланс " + balance);
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Neo" , 1000);
        bank.deposit(345.5);
        bank.withdraw(543.8);
        bank.printBalance();
    }


}
