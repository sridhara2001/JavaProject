package in.project;

import java.util.Scanner;

// Online Banking App
class bankApp{
	private static final String storedUsername = "Sridharvirat";
	private static final String storedPassword = "Sridhara@2001";
	
	public static String getUsername() {
		return storedUsername;
	}
	public static String getPassword() {
		return storedPassword;
	}
	
	int minBalance=500;
	int balance=minBalance;
	Scanner sc = new Scanner(System.in);
	public void deposite() {
		int depAmount;
		System.out.println("Enter Amount to be deposited");
		depAmount = sc.nextInt();
		if(depAmount>0) {
			balance=balance+depAmount;
			System.out.println("Amount is deposited and new balance amount is "+balance);
		} else {
			System.out.println("Enter Valid Amount");
		}
	}
	
	public void withdraw() {
		int withAmount;
		System.out.println("Enter Amount to withdraw");
		withAmount=sc.nextInt();
		if(balance>=withAmount+minBalance) {
			balance=balance-withAmount;
			System.out.println("Rs."+withAmount+" is withdrawn from your account");
		} else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void balance() {
		System.out.println("The balance in your account is "+balance);
	}
}

public class Project1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bankApp obj = new bankApp(); 
		System.out.println("Enter your username to login");
		String enteredUsername = sc.next();
		
		if(enteredUsername.equals(bankApp.getUsername())) {
			System.out.println("Enter password to continue");
			String enteredPassword = sc.next();
			if(enteredPassword.equals(bankApp.getPassword())) {
				System.out.println("Welcome To Our Online Banking App");
				System.out.println(enteredUsername+" is Signed in");
				char ch;
				do {
					System.out.println("Select an option to continue");
					System.out.println("1)Deposite 2)Withdraw 3)Balance");
					int option = sc.nextInt();
					switch(option){
						case 1:obj.deposite();
						break;
						case 2:obj.withdraw();
						break;
						case 3:obj.balance();
						break;
						default:System.out.println("Invalid Option");
					}
					System.out.println("Do you want to continue :Y/N");
					ch = sc.next().charAt(0);
				}while(ch=='Y');
				
				System.out.println("Thanks!!");
			} else {
				System.out.println("You have enetred wrong Password");
			}
		} else {
			System.out.println("Enter Valid Username");
		}

	}

}
