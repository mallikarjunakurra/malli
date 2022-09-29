package com.Bank;
// creating an abstract class of bank
abstract class Bank {
	
	// abstract method
    abstract void getBalance();
}

// Sub class 1 of bank
class BankA extends Bank {
	
	// Method overriding
     void getBalance()
      {
         System.out.println("The money deposited by boy in  Bank-A : Rs.1000/-");
      }
}

//Sub class 2 of bank
class BankB extends Bank {
	
	// Method overriding
     void getBalance()
      {
         System.out.println("The money deposited by boy in Bank-B : Rs.1500/-");
      }
}

//Sub class 3 of bank
class BankC extends Bank {
	
	// Method overriding
     void getBalance()
      {
         System.out.println("The money deposited by boy in Bank-c : Rs.2000/-");
      }
}


