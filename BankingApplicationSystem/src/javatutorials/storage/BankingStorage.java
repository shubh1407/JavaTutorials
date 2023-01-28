package javatutorials.storage;

import java.util.HashMap;
import java.util.Map;

import javatutorials.beans.AccountDetails;
import javatutorials.beans.AccountHolderInformation;

public class BankingStorage {

	public static Map<Integer, AccountHolderInformation> accountHolders =
			new HashMap<Integer, AccountHolderInformation>();
	
	public static Map<Integer, AccountDetails> accountDetails = 
			new HashMap<Integer, AccountDetails>();
	
	public static int custIdCounter =0;
	public static int accNoCounter =0;
}
