package services;

import domain.Account;

public class Report {

    public static void balance(Account account) {
        System.out.println("Su saldo es de $" + account.getBalance());
    }
    
    public static void data(Account account) {
        System.out.println(account.toString());
    }
}
