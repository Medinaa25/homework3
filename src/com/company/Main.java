package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         BankAccount customerAccount = new BankAccount();
         customerAccount.deposit(20000);
        while (true){
            try {
                customerAccount.withDraw(6000);
            } catch (LimitException limitException) {
                try {
                    customerAccount.withDraw((int) limitException.getRemainingAmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
