package com.Bank;

//Main method of bank
class BMain{ 
    public static void main(String args[]){
       
       // Creating Objects of each bank
       Bank a= new BankA();
       Bank b= new BankB();
       Bank c= new BankC();
 
       // Calling methods using objects
       a.getBalance();
       b.getBalance();
       c.getBalance();
}
}
