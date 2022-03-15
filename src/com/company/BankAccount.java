package com.company;

public class BankAccount {
     private double amount;

    public double getAmount(){
        return amount ;
     }
     public double deposit(double sum){
         System.out.println("Вы пополнили счет "+ sum);
        return  (amount += sum);
     }
    public void withDraw(int sum) throws LimitException {
         if (sum > amount){
             throw new LimitException("На вашем счету недостаточно средств" + "На вашем счету" + amount, amount);
         }

         amount -=sum;
        System.out.println("Вы сняли со счета "+ sum + " Счет:" + amount);
    }

}
