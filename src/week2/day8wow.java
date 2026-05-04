package week2;
import java.util.*;

class BankAccount {
    String ownerName;
    int accountNumber;
    double balance;

    public BankAccount (String ownerName, int accountNumber, double balance) {
        this.ownerName = ownerName;
        this.accountNumber =  accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString () {
        return ownerName + " " + accountNumber + " " + balance;
    }

    public void deposit (double amount) {
        balance = amount + balance;
    }


    public void withdraw (double amount) {
        balance = balance - amount;
    }
}

public class day8wow {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<BankAccount> accounts = new ArrayList<>();
    static void main() {
        accounts.add(new BankAccount("account1", 1221, 999));
        accounts.add(new BankAccount("account2", 1222, 998));
        accounts.add(new BankAccount("account3", 1223, 997));
        while (true) {

            System.out.println("1. See all account infos\n" +
                    "2. Withdraw from an account\n" +
                    "3. Deposit to an account\n" +
                    "4. Exit");
            System.out.print("Enter your choice");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> seeAllAccs();
                case 2 -> withdraw();
                case 3 -> deposit();
                case 4 -> System.exit(0);
            }
        }
    }

    static void seeAllAccs() {
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }

    static void withdraw() {
        System.out.print("Input your account ID: ");
        int accID = Integer.parseInt(scanner.nextLine());
        boolean accFound = false;

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).accountNumber == accID) {
                System.out.print("Input amount to withdraw: ");
                double amountToWithdraw = Double.parseDouble(scanner.nextLine());
                if (amountToWithdraw > accounts.get(i).balance) {
                    System.out.println("The amount is too high for your balance");
                } else {
                    accounts.get(i).withdraw(amountToWithdraw);
                    // this is the simplest way while still being effective
                }
                accFound = true;
            }
        }

        if (!accFound) {
            System.out.println("Account not found!");
        }
    }

    static void deposit() {
        System.out.print("Input your account ID: ");
        int accID = Integer.parseInt(scanner.nextLine());
        boolean accFound = false;

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).accountNumber == (accID)) {
                System.out.print("Input amount to deposit: ");
                double amountToDeposit= Double.parseDouble(scanner.nextLine());
                if (amountToDeposit < 0.00001) {
                    System.out.println("The amount you are trying to deposit is too little.");
                    return;
                }
                if (amountToDeposit > accounts.get(i).balance) {
                    System.out.println("The amount is too high for your balance");
                } else {
                    accounts.get(i).deposit(amountToDeposit);
                    // this is the simplest way while still being effective
                }
                accFound = true;
            }
        }

        if (!accFound) {
            System.out.println("Account not found!");
        }
    }
}
