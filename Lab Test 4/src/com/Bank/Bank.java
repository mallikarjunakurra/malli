package com.Bank;
abstract class Bank {
	
    abstract void getBalance();
}

class BankA extends Bank {
	
     void getBalance()
      {
         System.out.println("The money deposited by boy in  Bank-A : Rs.1000/-");
      }
}


class BankB extends Bank {
	
     void getBalance()
      {
         System.out.println("The money deposited by boy in Bank-B : Rs.1500/-");
      }
}


class BankC extends Bank {
	
     void getBalance()
      {
         System.out.println("The money deposited by boy in Bank-c : Rs.2000/-");
      }
}


