package JATTASK6;

public class Account {
	private double balance;

	public Account() {
		this("0000", 0);
	}

	public Account(String a, double b) {
		balance = b;
	}

	public void deposit(double amt) {
		if (amt > 0)
			balance += amt;
	}

	public void withdraw(double amt) {
		if (amt > 0 && amt <= balance)
			balance -= amt;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.deposit(500);
		a1.withdraw(200);
		System.out.println("Remaining balance ="+a1.getBalance());
		Account a2 = new Account("12345", 1000);
		a2.deposit(1500);
		a2.withdraw(500);
		System.out.println("Remaining balance ="+a2.getBalance());
	}
}
