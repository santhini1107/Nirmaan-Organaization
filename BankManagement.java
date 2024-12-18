package assessment2;

import java.util.Scanner;

public class BankManagement {
	public static void main(String[] args) {
		Bank bank =new Bank();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your pin");
		int pin=scan.nextInt();
		if(bank.getPin()==pin) {
			boolean True=true;
			while(True) {
			System.out.println("1 for Withdraw");
			System.out.println("2 for Deposite");
			System.out.println("3 for Check Balance");
			System.out.println("0 for  Exit");
			System.out.println("Enter your option");
			int option=scan.nextInt();
			 if(option==1) {
				System.out.println("Enter  withdrawel amount");
				int amount=scan.nextInt();
				if(amount<=bank.getAccountBalnce()) {
				 System.out.println("Withdraw transaction has been successful ");
				 bank.setAccountBalnce(bank.getAccountBalnce()-amount);
				}
			   else if(amount>=bank.getAccountBalnce()){
				     System.out.println("Insufficiant balance");
			}
			 }
		   if(option==2){
				   System.out.println("Enter  deposite amount");
				   int amount=scan.nextInt();
				   bank.setAccountBalnce(bank.getAccountBalnce()+amount);
				   System.out.println("Deposite transaction has been successful");
			   }
		   if(option==3) {
			   System.out.println(bank);
		   }
		    if(option==0) {
			   True=false;
			   System.out.println("Thank you come again");
		   }
		}
		}   
		
		else {
			System.out.println("Wrong pin");
		}
		}
		
		}
		
	

	
