package Pract8;

public class CheckingAccount {

	private int accountNumber;
	private double balance;

	public CheckingAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (this.balance - amount < 0)
			throw new InsufficientFundsException(this.balance - amount);
		this.balance -= amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

}
