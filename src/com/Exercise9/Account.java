package com.Exercise9;
import java.util.Random;
import java.util.Scanner;

public class Account {
    String owner;
    int balance;
    int accountNumber;
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();

    public String getOwner() {
        System.out.println("Enter Name");
        return owner = input.nextLine();
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        System.out.println("Enter Balance");
        return balance = input.nextInt();
    }

    public void setBalance(int balance) {
        this.balance =balance;
    }

    public String getAccountNumber() {
        accountNumber = rnd.nextInt(9999999);
        return String.format("%06d", accountNumber);
    }

    public void print(){
        System.out.print("Owner :"+this.getOwner()+"\n"+"Balance:"+this.getBalance()+"\n"+"Account Number: "+this.getAccountNumber()+"\n");
    }
}
class NotEnoughFunds extends Exception{
    public NotEnoughFunds(String message) {
        super(message);
    }

}
class DemonstrationException{
    public static void main(String[] args)  {
        Account acc = new Account();
        acc.print();
        System.out.println();
        System.out.println("Would you like to make a transfer?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.toLowerCase().equals("yes")) {
                System.out.println("Enter the amount for transfer");
                Scanner tr = new Scanner(System.in);
                int transfer = tr.nextInt();
                try {
                    if (transfer > acc.balance) {
                        throw new NotEnoughFunds("You have an insufficient balance for this transfer");
                    } else {
                        int newBalance = acc.balance - transfer;
                        System.out.println("Transfer successful, your new balance is: " + newBalance);

                    }
                }catch(NotEnoughFunds e){
                    System.out.println(e);
                }
        }
        else {
                System.out.println("End of program");
        }
    }
}
