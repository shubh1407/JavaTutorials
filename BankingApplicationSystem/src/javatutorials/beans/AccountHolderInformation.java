package javatutorials.beans;

public class AccountHolderInformation {

	private int custId;
	private int accountNo;
	private String firstName;
	private String lastName;
	private Address address;
	
	public AccountHolderInformation(int custId, int accountNo, String firstName, String lastName, Address address) {
		super();
		this.custId = custId;
		this.accountNo = accountNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Your Customer information is [customer Id=" + custId + ", account No=" + accountNo + ", first Name=" + firstName
				+ ", last Name=" + lastName + ", " + address;
	}
	
	
}
