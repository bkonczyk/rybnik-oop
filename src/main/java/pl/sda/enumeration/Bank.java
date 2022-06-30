package pl.sda.enumeration;

public class Bank {

    public static void main(String[] args) {
        AccountType credit = AccountType.CREDIT;
        AccountType loan = AccountType.LOAN;
        AccountType[] values = AccountType.values();
        String shortName = credit.getShortName();
        System.out.println(shortName);
        System.out.println(loan.introduceAccount());
    }
}
