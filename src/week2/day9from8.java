package week2;
import java.util.*;
import java.text.NumberFormat;

class BankAccountAgain {
    private final String ownerName;
    private final int accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    BankAccountAgain(String ownerName, int accountNumber, double balance, ArrayList<String> transactionHistory) {
        this.ownerName = ownerName;
        this.accountNumber =  accountNumber;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    @Override
    public String toString () {
        return ownerName + " " + accountNumber + " " + balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit (double amount) {
        balance = amount + balance;
    }


    public void withdraw (double amount) {
        balance = balance - amount;
    }

    public void DepositShowToTransactionHistory(BankAccountAgain accountAgain, double amount) {
        accountAgain.transactionHistory.add("+ "+ amount);
    }

    public void WithdrawShowToTransactionHistory(BankAccountAgain accountAgain, double amount) {
        accountAgain.transactionHistory.add("- "+ amount);
    }

    public void getFormattedBalance(BankAccountAgain accountAgain) {
        Locale phLocale = new Locale("en", "PH");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(phLocale);
        String formattedBal = formatter.format(accountAgain.balance);
        System.out.println(formattedBal);
    }

    public void getTransactionHistory(BankAccountAgain accountAgain) {
        if (accountAgain.transactionHistory.isEmpty()) {
            System.out.println("Transaction History Empty...");
        } else {
            List<String> history = transactionHistory.stream().toList();
            System.out.println(accountAgain.getOwnerName() + "'s history: ");
            for (String past : history) {
                System.out.println(past);
            }
        }
    }

    //day8 asks if i should make a balance setter be public, but why wouuld i need a balance setter, that just breaks banks irl

}

public class day9from8 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<BankAccountAgain> accounts = new ArrayList<>();
    static void main() {
        accounts.add(new BankAccountAgain("account1", 1221, 999, new ArrayList<>()));
        accounts.add(new BankAccountAgain("account2", 1222, 998, new ArrayList<>()));
        accounts.add(new BankAccountAgain("account3", 1223, 997, new ArrayList<>()));
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

//            accounts.get(0).getAccountNumber;
//            okok i get it i cant access it
        }
    }

    static void seeAllAccs() {
        for (BankAccountAgain account : accounts) {
            System.out.println(account.getOwnerName() + " " + account.getAccountNumber() + " " + account.getBalance());
        }
    }

    static void withdraw() {
        System.out.print("Input your account ID: ");
        int accID = Integer.parseInt(scanner.nextLine());
        boolean accFound = false;

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accID) {
                System.out.print("Input amount to withdraw: ");
                double amountToWithdraw = Double.parseDouble(scanner.nextLine());
                if (amountToWithdraw > accounts.get(i).getBalance()) {
                    System.out.println("The amount is too high for your balance");
                } else {
                    accounts.get(i).withdraw(amountToWithdraw);
                    accounts.get(i).WithdrawShowToTransactionHistory(accounts.get(i), amountToWithdraw);

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

        for (BankAccountAgain account : accounts) {
            if (account.getAccountNumber() == (accID)) {
                System.out.print("Input amount to deposit: ");
                double amountToDeposit = Double.parseDouble(scanner.nextLine());
                if (amountToDeposit < 0.00001) {
                    System.out.println("The amount you are trying to deposit is too little.");
                    return;
                }
                if (amountToDeposit > account.getBalance()) {
                    System.out.println("The amount is too high for your balance");
                } else {
                    account.deposit(amountToDeposit);
                    account.DepositShowToTransactionHistory(account, amountToDeposit);
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
