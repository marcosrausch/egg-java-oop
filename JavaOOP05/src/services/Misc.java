package services;

public class Misc {

    public static final int ZERO = 0;

    public static double twentyPercent(int amount) {
        return amount * 20 / 100;
    }

    public static boolean validateWithdraw(int balance, int outcome) {
        return (balance - (int) outcome) >= ZERO;
    }

    public static boolean validateQuickWithdraw(int balance, int outcome) {
        return outcome <= twentyPercent(balance);
    }
}
