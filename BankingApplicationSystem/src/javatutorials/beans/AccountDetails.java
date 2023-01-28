package javatutorials.beans;

public class AccountDetails {

	private int accountNo;
	private double amount;

	public AccountDetails(int accountNo, double amount) {
		super();
		this.accountNo = accountNo;
		this.amount = amount;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Your Account Details is account No=" + accountNo + ", amount=" + amount;
	}
	
	
	
	
}
