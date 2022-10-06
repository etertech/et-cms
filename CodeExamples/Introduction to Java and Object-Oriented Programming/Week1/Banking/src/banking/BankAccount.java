package banking;

/**
 * Represents a checking/savings bank account for a customer.
 */
public class BankAccount {
	
	//instance vars
	
	/**
	 * type of account (checking/savings)
	 */
	String accounttype;
	
	/**
	 * Balance for bank account.
	 */
	double balance;
	
	/**
	 * Customer for this account.
	 */
	Customer customer;
	
	// constructor
	/**
	 * Creates a bank account of given type for given customer.
	 * @param accountType accounttype for bank account
	 * @param customer for bank account
	 */
	
	public BankAccount(String accountType, Customer customer) {
		this.accounttype = accountType;
		this.customer = customer;
		
	}
	
	//methods
	
	/**
	 * Deposits the given amount
	 * @param amount to add to balance
	 */
	public void deposit(double amount) {
		this.balance +=amount;
	}
	
	/**
	 * Wthidraws the given amount from balance.
	 * @param amount amount to withdraw
	 * @throws Exception if given amount is lager than available balance
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Amount is greater than available balance.");
		}
		this.balance -= amount;
		
	}
	
	/**
	 * Returns account type and balance for this bank account.
	 * @return
	 */
	public String getAccountInfo() {
		return this.accounttype + ": " + this.balance;
	}
	
	/**
	 * Returns the customer name and address for this bank account.
	 * @return string with all the info
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
		
	}
}
