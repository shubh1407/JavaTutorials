package javatutorials.util;

import javatutorials.beans.AccountDetails;
import javatutorials.beans.AccountHolderInformation;
import javatutorials.storage.BankingStorage;

public class BankOperationsUtility {

	
	public boolean openAccount(AccountHolderInformation accountHolderInformation) {
		BankingStorage.accountHolders.put(accountHolderInformation.getCustId(), accountHolderInformation);
		BankingStorage.accountDetails.put(accountHolderInformation.getAccountNo(), 
				new AccountDetails(accountHolderInformation.getAccountNo(), 0));
		return true;
	}
	
	public AccountDetails getAccountDetails(int accountNo) {
		return BankingStorage.accountDetails.get(accountNo);
	}
	
	public AccountHolderInformation getCustomerDetails(int custId) {
		return BankingStorage.accountHolders.get(custId);
	}
	
	public AccountDetails depositAmount(int custId,double amount) {
		AccountHolderInformation accountHolderInformation = getCustomerDetails(custId);
		AccountDetails accountDetails = getAccountDetails(accountHolderInformation.getAccountNo());
		accountDetails.setAmount(accountDetails.getAmount()+amount);
		return accountDetails;
	}
	
	public AccountDetails withdrawlAmount(int custId,double amount) {
		AccountHolderInformation accountHolderInformation = getCustomerDetails(custId);
		AccountDetails accountDetails = getAccountDetails(accountHolderInformation.getAccountNo());
		accountDetails.setAmount(accountDetails.getAmount()-amount);
		return accountDetails;
	}
	
	
}
