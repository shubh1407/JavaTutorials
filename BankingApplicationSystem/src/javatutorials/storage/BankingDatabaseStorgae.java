package javatutorials.storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javatutorials.beans.AccountDetails;
import javatutorials.beans.AccountHolderInformation;
import javatutorials.beans.Address;

/*
 * 
 */
public class BankingDatabaseStorgae {

	public AccountHolderInformation insertAccountHolder(AccountHolderInformation accountHolderInformation)
			throws ClassNotFoundException, SQLException {

		// step -1 class.forName // register driver class
		Class.forName("com.mysql.jdbc.Driver");

		// step 2 - create connection

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication" + "?useSSL=false",
				"root", "root");

		// step-3 - -create statement or preparedStatement object

		PreparedStatement preparedStatement = con
				.prepareStatement("INSERT INTO CUSTOMER_INFORMATION (CUSTID,ACC_NO,FIRST_NAME,LAST_NAME,HOUSE_NO"
						+ ",CITY,COUNTRY)"
						+ " VALUES (?,?,?,?,?,?,?)");

		

		
		preparedStatement.setInt(1, accountHolderInformation.getCustId());
		preparedStatement.setInt(2, accountHolderInformation.getAccountNo());
		preparedStatement.setString(3, accountHolderInformation.getFirstName());
		preparedStatement.setString(4, accountHolderInformation.getLastName());
		preparedStatement.setInt(5, accountHolderInformation.getAddress().getHouseNo());
		preparedStatement.setString(6, accountHolderInformation.getAddress().getCity());
		preparedStatement.setString(7, accountHolderInformation.getAddress().getCountry());
		preparedStatement.execute();

		preparedStatement = con.prepareStatement("INSERT INTO ACCOUNT_INFORMATION (ACC_NO,BALANCE) VALUES (?,?)");

		preparedStatement.setDouble(2, 0);
		preparedStatement.setInt(1, BankingStorage.accNoCounter);
		// 4. Execution part 
		preparedStatement.execute();

		return accountHolderInformation;
	}

	public AccountHolderInformation getCustomerInfo(int custId) throws ClassNotFoundException, SQLException {

		// step -1 class.forName // register driver class
		Class.forName("com.mysql.jdbc.Driver");

		// step 2 - create connection

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication" + "?useSSL=false",
				"root", "root");

		// step-3 - -create statement or preparedStatement object

		PreparedStatement preparedStatement = con
				.prepareStatement("SELECT * FROM CUSTOMER_INFORMATION WHERE CUSTID=?");

		
		preparedStatement.setInt(1, custId);
		ResultSet resultSet = preparedStatement.executeQuery();
		AccountHolderInformation accountHolderInformation = null;
		while(resultSet.next()) {
			accountHolderInformation = new AccountHolderInformation(resultSet.getInt(1), resultSet.getInt(2), 
					resultSet.getString(3),
					resultSet.getString(4),new Address(resultSet.getInt(5), resultSet.getString(6), resultSet.getString(7)));
		}

		return accountHolderInformation;
	}

	public AccountDetails getAccountInfo(int accountNo) throws ClassNotFoundException, SQLException {

		// step -1 class.forName // register driver class
		Class.forName("com.mysql.jdbc.Driver");

		// step 2 - create connection

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication" + "?useSSL=false",
				"root", "root");

		// step-3 - -create statement or preparedStatement object

		PreparedStatement preparedStatement = con
				.prepareStatement("SELECT * FROM ACCOUNT_INFORMATION WHERE ACC_NO=?");

	
		preparedStatement.setInt(1, accountNo);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		AccountDetails accountDetails = null;
		while(resultSet.next()) {
			accountDetails = new AccountDetails(resultSet.getInt(1), resultSet.getDouble(2));
		}

		return accountDetails;
	}
	
	public AccountDetails updateAccountInfo(AccountDetails accountDetails) throws ClassNotFoundException, SQLException {

		// step -1 class.forName // register driver class
		Class.forName("com.mysql.jdbc.Driver");

		// step 2 - create connection

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication" + "?useSSL=false",
				"root", "root");

		// step-3 - -create statement or preparedStatement object

		PreparedStatement preparedStatement = con
				.prepareStatement("UPDATE ACCOUNT_INFORMATION SET AMOUNT=? WHERE ACC_NO=?");

		
		preparedStatement.setDouble(1, accountDetails.getAmount());
		preparedStatement.setInt(2, accountDetails.getAccountNo());
		
		preparedStatement.executeUpdate();

		return accountDetails;
	}

	public AccountDetails depositAmount(int custId, double amount)
			throws ClassNotFoundException, SQLException {
		//custmer info
		AccountHolderInformation accountHolderInformation = getCustomerInfo(custId);
		// account info
		AccountDetails accountDetails = null;
		if(accountHolderInformation!=null) {
			accountDetails = getAccountInfo(accountHolderInformation.getAccountNo());
			accountDetails.setAmount(accountDetails.getAmount()+amount);
			//update amount in db
			updateAccountInfo(accountDetails);
		}
		return accountDetails;
	}
	
	public AccountDetails withdrawlAmount(int custId, double amount)
			throws ClassNotFoundException, SQLException {
		//custmer info
		AccountHolderInformation accountHolderInformation = getCustomerInfo(custId);
		// account info
		AccountDetails accountDetails = null;
		if(accountHolderInformation!=null) {
			accountDetails = getAccountInfo(accountHolderInformation.getAccountNo());
			accountDetails.setAmount(accountDetails.getAmount()-amount);
			//update amount in db
			updateAccountInfo(accountDetails);
		}
		return accountDetails;
	}
	
	public AccountDetails fundtransferAmount(int sourceCustId,int targetCustId, double amount)
			throws ClassNotFoundException, SQLException {
		//custmer info
		AccountHolderInformation sourceAccountHolderInformation = getCustomerInfo(sourceCustId);
		
		AccountHolderInformation targetAccountHolderInformation = getCustomerInfo(targetCustId);
		// account info
		AccountDetails sourceAccountDetails =null;
		AccountDetails targetAccountDetails = null;
		if(sourceAccountHolderInformation!=null && targetAccountHolderInformation!=null) {
			sourceAccountDetails = getAccountInfo(sourceAccountHolderInformation.getAccountNo());
			
			targetAccountDetails = getAccountInfo(targetAccountHolderInformation.getAccountNo());
			
			sourceAccountDetails.setAmount(sourceAccountDetails.getAmount()-amount);
			//update amount in db
			updateAccountInfo(sourceAccountDetails);
			
			targetAccountDetails.setAmount(targetAccountDetails.getAmount()+amount);
			//update amount in db
			updateAccountInfo(targetAccountDetails);
		}
		
		return sourceAccountDetails;
	}
}
