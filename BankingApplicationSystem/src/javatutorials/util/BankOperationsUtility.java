package javatutorials.util;

import java.sql.SQLException;

import javatutorials.beans.AccountDetails;
import javatutorials.beans.AccountHolderInformation;
import javatutorials.storage.BankingDatabaseStorgae;
import javatutorials.storage.BankingStorage;

public class BankOperationsUtility {

	private BankingDatabaseStorgae bankingDatabaseStorgae = new BankingDatabaseStorgae();
	public boolean openAccount(AccountHolderInformation accountHolderInformation) throws ClassNotFoundException, SQLException {
		bankingDatabaseStorgae.insertAccountHolder(accountHolderInformation);
		return true;
	}
	
	public AccountDetails getAccountDetails(int accountNo) throws ClassNotFoundException, SQLException {
		return bankingDatabaseStorgae.getAccountInfo(accountNo);
	}
	
	public AccountHolderInformation getCustomerDetails(int custId) throws ClassNotFoundException, SQLException {
		return bankingDatabaseStorgae.getCustomerInfo(custId);
	}
	
	public AccountDetails depositAmount(int custId,double amount) throws ClassNotFoundException, SQLException {
		return bankingDatabaseStorgae.depositAmount(custId, amount);
	}
	
	public AccountDetails withdrawlAmount(int custId,double amount) throws ClassNotFoundException, SQLException {
		return bankingDatabaseStorgae.withdrawlAmount(custId, amount);
	}
	
	public AccountDetails fundTrasfer(int sourceCustId,int targetCustId,double amount) throws ClassNotFoundException, SQLException {
		return bankingDatabaseStorgae.fundtransferAmount(sourceCustId,targetCustId, amount);
	}
}
