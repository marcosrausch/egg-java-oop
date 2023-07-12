package domain;

public class Account {

    private int ID;
    private long clientID;
    private int balance;
    
    @Override
    public String toString() {
        return "Número de cuenta: " + this.ID + "\n"
                + "DNI del titular: " + this.clientID + "\n"
                + "Saldo: " + this.balance;
    }

    // getters & setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public long getClientID() {
        return clientID;
    }

    public void setClientID(long clientID) {
        this.clientID = clientID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // constructors
    public Account() {
    }

    public Account(int ID, long clientID, int balance) {
        this.ID = ID;
        this.clientID = clientID;
        this.balance = balance;
    }

}
