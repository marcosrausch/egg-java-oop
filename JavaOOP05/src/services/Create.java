package services;

import domain.Account;
import java.util.Random;
import java.util.Scanner;

public class Create {   

    public static Account account() {
        Random random = new Random();
        Account account = new Account();
        Scanner scanFor = new Scanner(System.in);

        System.out.println("Ingrese a continuación el DNI del cliente");
        account.setClientID(scanFor.nextLong());

        account.setID(random.nextInt(Integer.MAX_VALUE));
        account.setBalance(Misc.ZERO);

        System.out.println("¡Cuenta creada exitosamente!");
        Report.data(account);

        return account;
    }
    
}
