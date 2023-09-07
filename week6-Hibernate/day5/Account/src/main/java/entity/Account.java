package entity;

import jakarta.persistence.*;

@Entity
@Table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
    @Column(name = "accNumber")
    private int accNumber;
    @Column(name = "accHolderName")
    private String accHolderName;
    @Column(name = "balance")
    private int balance;

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    @Column(name = "is_active")
    private boolean is_active;
    public Account() {
    }







    public Account(int id, int accNumber, String accHolderName, int balance) {
        this.id = id;
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
        this.is_active = is_active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
