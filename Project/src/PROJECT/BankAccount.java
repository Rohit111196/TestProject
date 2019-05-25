package PROJECT;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
	BannkAccount BA = new BannkAccount("ROHIT KUMAR", "CYXZ001");
	BA.showMenu();

}
}

class BannkAccount{
	int balance;
	int previousTransaction;
	String CustomerName;
	String CustomerID;
	
	BannkAccount(String cname, String cID){
		 CustomerName = cname;
		 CustomerID  =  cID;
		
	}
	
	
	void deposited(int amount) {
		if(amount!=0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdrawal(int amount) {
		if(amount!=0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void GetPreviousTransaction() {
		
		if(previousTransaction > 0) {
			
			System.out.println("Deposited : "+previousTransaction);
			
		}else if(previousTransaction < 0){
			
			
			System.out.println("Withdrawn : "+ Math.abs(previousTransaction));
			
			}else {
				System.out.println(" No Transaction Occured ");
			}
	}
	
	void showMenu() {
		
	  char option = '0';
	  Scanner scn = new Scanner(System.in);
	  
	  System.out.println("---------------------------------------------");
	  System.out.println("WELCOME :"+ CustomerName);
	  System.out.println("Your ID :"+ CustomerID);
	  System.out.println("\n");
	  System.out.println("A : balance");
	  System.out.println("B : deposit");
	  System.out.println("C : withdrawal");
	  System.out.println("D : previousTransaction");
	  System.out.println("E : Exit");
	  System.out.println("---------------------------------------------");
	  
	  do {
		  System.out.println("---------------------------------------------");
		  System.out.println("Enter an option");
		  System.out.println("---------------------------------------------");
	      option = scn.next().charAt(0);
	      System.out.println("\n");
	  
	  switch(option){
		  
		  case 'A':
			  System.out.println("---------------------------------------------");
			  System.out.println("balance : "+balance);
			  System.out.println("---------------------------------------------");
			  System.out.println("\n");
			  break;
			  
		  case 'B':
			  System.out.println("---------------------------------------------");
			  System.out.println("Enter the amount to be deposited");
			  int amt1 = scn.nextInt();
			  deposited(amt1);
			  System.out.println("---------------------------------------------");
			  System.out.println("\n");
			  break;
			  
		  case 'C':
			  System.out.println("---------------------------------------------");
			  System.out.println("Enter the amount to be withdraw");
			  int amt2 = scn.nextInt();
			  withdrawal(amt2);
			  System.out.println("---------------------------------------------");
			  System.out.println("\n");
			  break;
			  
		  case 'D':
			  System.out.println("---------------------------------------------");
			  GetPreviousTransaction();
			  System.out.println("---------------------------------------------");
			  System.out.println("\n");
			  break;
			  
		  case 'E':
			  System.out.println("\n");
			  break;
			  
			  default:
				  System.out.println("INVALID OPTION! Please Enter Again");
				  System.out.println("\n");
				  break;
			  			  
		
	  }
	  
	  }while(option!='E');
		  
		  System.out.println("Thanking you for using service");
		 
	 	
	}
	
}
