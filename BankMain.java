// Write a program to create a banking system with three classes – Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
package Java;
import java.util.Scanner;
interface Accounts {
	 float deposit();
	 float withdraw();
	 float calculateInterest();
	 float viewBalance();
}
class Bank {
	Scanner scanner = new Scanner(System.in);
	String bankName, name;
	String BankName()
	{
		System.out.println("Enter the name of the bank");
		bankName = scanner.next();
		return bankName;
	}
	String AccountHolder()
	{
		System.out.println("Enter the name of the account holder");
		name = scanner.next();
		return name;
	}
}
class CurrentAccount implements Accounts {
	Scanner scanner = new Scanner(System.in);
	float balanceinitial, amountwithdrawn, amountdeposit, balancefinal, interests;
	int times;
	static float rates = (float) 5.25;
	public float initialBalance()
	{
		System.out.println("Enter your Current Account balance");
		balanceinitial = scanner.nextFloat();
		return balanceinitial;
	}
	public float withdraw()
	{
		System.out.println("Enter withdrawn amount");
		amountwithdrawn = scanner.nextFloat();
		return amountwithdrawn;
	}
	public float deposit()
	{
		System.out.println("Enter deposit amount");
		amountdeposit = scanner.nextFloat();
		return amountdeposit;
	}
	public float viewBalance()
	{
		balancefinal = (balanceinitial + amountdeposit - amountwithdrawn);
		return balancefinal;
	}
	public float calculateInterest()
	{
		System.out.println("Enter the time in years for calculating your interest");
		times = scanner.nextInt();
		interests = ((balancefinal * rates * times)/100);
		return interests;
	}
}
class SavingsAccount implements Accounts{
	Scanner scanner = new Scanner(System.in);
	float initialbalance,withdrawnamount, depositamount, finalbalance, interest;
	int time;
	static float rate = (float) 5.5;
	public float initialBalance()
	{
		System.out.println("Enter your Savings Account balance");
		initialbalance = scanner.nextFloat();
		return initialbalance;
	}
	public float withdraw()
	{
		System.out.println("Enter withdrawn amount");
		withdrawnamount = scanner.nextFloat();
		return withdrawnamount;
	}
	public float deposit()
	{
		System.out.println("Enter deposit amount");
		depositamount = scanner.nextFloat();
		return depositamount;
	}
	public float viewBalance()
	{
		finalbalance = (initialbalance + depositamount - withdrawnamount);
		return finalbalance;
	}
	public float calculateInterest()
	{
		System.out.println("Enter the time in years for calculating your interest");
		time = scanner.nextInt();
		interest = ((finalbalance * rate * time)/100);
		return interest;
	}
}
public class BankMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank a = new Bank();
		SavingsAccount b = new SavingsAccount();
		CurrentAccount c = new CurrentAccount();
		System.out.println("The Bank Name is "+a.BankName());
		System.out.println("The name of the account holder is "+a.AccountHolder());
		System.out.println();
		System.out.println("The initial Savings Account Balance is "+b.initialBalance());
		System.out.println("The amount withdrawn from Savings Account is "+b.withdraw());
		System.out.println("The amount deposited to Savings Account is "+b.deposit());
		System.out.println("The final Savings Account Balance is "+b.viewBalance());
		System.out.println("The interest of Savings Account is "+b.calculateInterest());
		System.out.println();
		System.out.println("The initial Current Account Balance is "+c.initialBalance());
		System.out.println("The amount withdrawn from Current Account is "+c.withdraw());
		System.out.println("The amount deposited to Current Account is "+c.deposit());
		System.out.println("The final Current Account Balance is "+c.viewBalance());
		System.out.println("The interest of Current Account is "+c.calculateInterest());
	}
}
