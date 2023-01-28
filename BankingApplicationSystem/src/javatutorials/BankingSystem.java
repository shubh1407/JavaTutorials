/*The series of menus displayed are as follows:

	Display all account details
	Search by account number
	Deposit the amount
	Withdraw the amount
	Exit

// AccountHolderInformation  -> acc_no,cust_id,acc_balance,custName,address,
// BankOprations -> openAccount , depositAmount , withdrawlAmount , getAccDetails ,getbalanceAmount
// BankingSystem  -> Collections 
*/

package javatutorials;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import javatutorials.beans.AccountDetails;
import javatutorials.beans.AccountHolderInformation;
import javatutorials.beans.Address;
import javatutorials.storage.BankingStorage;
import javatutorials.util.BankOperationsUtility;

public class BankingSystem {

	public static void main(String[] args) {
		BankOperationsUtility bankOperationsUtility = new BankOperationsUtility();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("We have following operations . Choose one option \n" + //
					"1. Open New Account \n" //
					+ "2. Deposit the amount in account \n" //
					+ "3. Withdrawl the amount from account \n" //
					+ "4. Get Customer details \n" //
					+ "5. Get Account details \n" //
					+ "6. Fund Transfer from one account to other \n " //
					+ "7. Exit the Application.");

			int option = scanner.nextInt();
			int custId=0;
			switch (option) {
			case 1:
				System.out.println("Thanks for choosing us for your banking operations");
				System.out.println("Please provide your first name");
				String firstName = scanner.next();
				System.out.println("Please provide your last name");
				String lastName = scanner.next();
				System.out.println("Please enter your houseNo");
				int houseNo = scanner.nextInt();
				System.out.println("Please enter your city");
				String city = scanner.next();
				System.out.println("Please enter your country");
				String country = scanner.next();
				
				// Validation for all informations like country and city.
				
				System.out.println("Please wait for a while. We are working on your request.... ");
				
				Address address = new Address(houseNo, city, country);
				BankingStorage.custIdCounter++;
				BankingStorage.accNoCounter++;
				AccountHolderInformation accountHolderInformation = 
						new AccountHolderInformation(BankingStorage.custIdCounter, 
								BankingStorage.accNoCounter, firstName, lastName, address);
				
				if(bankOperationsUtility.openAccount(accountHolderInformation)) {
					System.out.println("Your account open successfully, "
							+ "your account no is "+accountHolderInformation.getAccountNo()
							+" your customer id is "+accountHolderInformation.getCustId());
				}
				else {
					System.out.println("Sorry! Something wrong happened");
				}
				
				break;
			case 2:
				
				// Authentication using password
				
				// OTP service using otp service
				
				System.out.println("Please enter your customer Id");
				custId = scanner.nextInt();
				if(BankingStorage.accountHolders.keySet().contains(custId)) {
					System.out.println("Please enter amount you want to deposit");
					double amount= scanner.nextDouble();
					AccountDetails accountDetails= bankOperationsUtility.depositAmount(custId, amount);
					System.out.println("Amount is deposited successfully.\n"
							+ "Your updated amount is "+accountDetails.getAmount());
				}
				else {
					System.out.println("Customer not found.Please verify your details.");
				}
				
				break;
			case 3:
				
				System.out.println("Please enter your customer Id");
				custId = scanner.nextInt();
				if(BankingStorage.accountHolders.keySet().contains(custId)) {
					System.out.println("Please enter amount you want to withdrawl from account");
					double amount= scanner.nextDouble();
					AccountDetails accountDetails= bankOperationsUtility.withdrawlAmount(custId, amount);
					System.out.println("Amount is withdrawl successfully.\n"
							+ "Your updated amount is "+accountDetails.getAmount());
				}
				else {
					System.out.println("Customer not found.Please verify your details.");
				}
				break;
			case 4:
				System.out.println("Please enter your customer Id");
				custId = scanner.nextInt();
				if(BankingStorage.accountHolders.keySet().contains(custId)) {
					System.out.println(bankOperationsUtility.getCustomerDetails(custId).toString());
				}
				else {
					System.out.println("Customer not found.Please verify your details.");
				}
				break;
			case 5:
				System.out.println("Please enter your customer Id");
				custId = scanner.nextInt();
				if(BankingStorage.accountHolders.keySet().contains(custId)) {
					System.out.println(bankOperationsUtility.getAccountDetails
					(bankOperationsUtility.getCustomerDetails(custId).getAccountNo()).toString());
				}
				else {
					System.out.println("Customer not found.Please verify your details.");
				}
				break;
			case 6:
				System.out.println("Please enter your customer Id");
				custId = scanner.nextInt();
				if(BankingStorage.accountHolders.keySet().contains(custId)) {
					System.out.println("Please enter target customer Id");
					int custId2 = scanner.nextInt();
					if(custId==custId2) {
						System.out.println("Source account and target account can't be same");
						continue;
					}
					if(BankingStorage.accountHolders.keySet().contains(custId2)) {
						System.out.println("Please enter amount you want to transfer");
						double amount= scanner.nextDouble();
						AccountDetails accountDetails= bankOperationsUtility.withdrawlAmount(custId, amount);
						bankOperationsUtility.depositAmount(custId2, amount);
						System.out.println("Your fund transfer is done successfully\n"
								+ "your updated balance is "+accountDetails.getAmount());
					}
					else {
						System.out.println("Target Customer not found.Please verify details.");
					}
				}
				else {
					System.out.println("Customer not found.Please verify your details.");
				}
				break;
			case 7:
				System.out.println("Thanks for using my application");
				System.exit(0);
			default:
				System.out.println("Invalid operation.Please Choose correct option");
				break;
			}
		} while (true);
	}
}
