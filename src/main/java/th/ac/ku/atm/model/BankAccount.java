package th.ac.ku.atm.model;

public class BankAccount {
    private int id;
    private String type;
    private int customerId;
    private double balance;

    public BankAccount(int id, String type, int customerId,double balance) {
        this.id = id;
        this.type = type;
        this.customerId = customerId;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int pin) {
        this.customerId = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
