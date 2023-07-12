package services;

import domain.Account;
import java.util.Scanner;

public class Manage {

    static Scanner scanFor = new Scanner(System.in);

    public static void deposit(Account account) {
        System.out.print("¿Cuánto dinero desea depositar? \n$");
        int income = scanFor.nextInt();

        account.setBalance(account.getBalance() + income);
        Report.balance(account);
    }

    public static void withdraw(Account account) {
        int balance = account.getBalance();
        
        System.out.print("¿Cuánto dinero desea retirar? \n$");
        int outcome = scanFor.nextInt();
        
        if (Misc.validateWithdraw(balance, outcome)) {
           account.setBalance(balance - outcome);
           System.out.println("¡Gracias!");
           Report.balance(account);
        } else {
            System.out.println("Saldo insuficiente. \nPuede retirar hasta $" + balance);
        }
    }
    
    public static void quickWithdraw(Account account) {
        int balance = account.getBalance();
        
        System.out.println("¡Bienvenido al sistema de extracción rápida!");
        System.out.print("¿Cuánto dinero desea retirar? \n$");
        int outcome = scanFor.nextInt();
        
        if (Misc.validateQuickWithdraw(balance, outcome)) {
           account.setBalance(balance - outcome);
           System.out.println("¡Gracias!");
           Report.balance(account);            
        } else {
            System.out.println("Las extracciones rápidas sólo permiten retirar un 20% de su saldo actual. \nPuede retirar hasta $" + Misc.twentyPercent(balance));
        }
    }
}
