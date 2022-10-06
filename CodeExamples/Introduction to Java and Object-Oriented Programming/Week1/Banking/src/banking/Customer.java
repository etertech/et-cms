package banking;

/**
 * Represents a customer of a bank.
 * @author xzhao
 *
 */
public class Customer {
	
	//instance vars
	
	/**
	 * Name of customer.
	 */
	String name;
	
	/**
	 * Address of customer.
	 */
	String address;
	
	/**
	 * Creates a customer with given name.
	 * @param name of customer
	 */
	public Customer(String name) {
		// sets instance vars name to given name
		this.name = name;
		
	//methods
	}
	
	/**
	 * Sets the address of customer to be given address.
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	
	}
	
	/**
	 * Return customer's name.
	 * @return name of customer
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Return customer's address.
	 * @return address of customer
	 */
	public String getAddress() {
		return this.address;
	}
}
