package ejemplos.original.divergentchange;

public class Account {
	
	private int accountNumber;
	private double balance = 0;
	
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void credit(double amount) {
		balance += amount;
	}
	
	public void debit(double amount) {
		balance -= amount;
	}
	
	public String toXml() {
		return "<account><id>" + Integer.toString(getAccountNumber()) + "</id>"
				+ "<balance>" + Double.toString(getBalance()) + "</balance>";
	}

}
