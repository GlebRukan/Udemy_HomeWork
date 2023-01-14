package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
    double amountInput;

    double popolnenieScheta (double amountInput) {
        balance = balance + amountInput;
        return balance;
    }
    double spisanieSoScheta (double amountInput) {
        balance = balance - amountInput;
        return balance;
    }
    void showAccountInfo() {
        System.out.println("Имя: " + name + ", номер счета - " + id + ", баланс счета = " + balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Gleb";
        MyAccount.balance = 12.5;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 30;

        HisAccount.id = 3;
        HisAccount.name = "Lisa";
        HisAccount.balance = 60;


        MyAccount.showAccountInfo();
        MyAccount.popolnenieScheta(55);
        MyAccount.showAccountInfo();
        MyAccount.spisanieSoScheta(4);
        MyAccount.showAccountInfo();

        YourAccount.showAccountInfo();
        YourAccount.popolnenieScheta(2);
        YourAccount.showAccountInfo();
        YourAccount.spisanieSoScheta(500);
        YourAccount.showAccountInfo();

        HisAccount.showAccountInfo();
        HisAccount.popolnenieScheta(200);
        HisAccount.showAccountInfo();
        HisAccount.spisanieSoScheta(400);
        HisAccount.showAccountInfo();
    }
}