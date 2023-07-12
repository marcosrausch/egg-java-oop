package javaoop05;

import domain.Account;
import services.Create;
import services.Manage;

public class JavaOOP05 {
    
    static void run() {
        Account account = Create.account();
        Manage.deposit(account);
        Manage.withdraw(account);
        Manage.quickWithdraw(account);
    }

    public static void main(String[] args) {
        run();
    }
    
}
