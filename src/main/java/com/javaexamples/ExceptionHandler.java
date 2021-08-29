package com.javaexamples;

class Amount {
	String	currency;//	Should	be	an	Enum
	int amount;// Should ideally use	BigDecimal
	
	// constructor
	public Amount(String currency, int amount)	{
		this.currency =	currency;
		this.amount = amount;
		System.out.println("Constructor called");
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	static Amount addAmounts(Amount	amount1, Amount amount2) {
		
		try {
			if (!amount1.currency.equals(amount2.currency)) {
				// throwing an exception explicitly
				throw new RuntimeException("Currencies are not matching");
			}
		} catch (Exception e) {
			System.out.println("Explicit: Exception Handled Gracefully");
		} 
		
		return new Amount(amount1.currency,	amount1.amount + amount2.amount);
	}
	
	// destructor
	protected void finalize() {
		System.out.println("Destructor called");
	}
}

public class ExceptionHandler {

	public static void main(String[] args) {
		
		Amount a = new Amount("dollar", 5);
		Amount b = new Amount("rupees", 5);
		//throw an exception explicitly
		Amount c = Amount.addAmounts(a, b);
		System.out.println("Amount = " + c.getAmount());
	
		System.out.println("-------------------------------");
		
		//illustrates try-catch-finally
		//throw an exception implicitly
		exceptionMethod();
		
	}
	
	private static void exceptionMethod() {
		Amount d = new Amount("yen", 5);
	
		// Try removing the try-catch-finally block & have only next 2 lines 
		try {
			// this block throws exception
			d.setCurrency(null);
			d.getCurrency().toString();
		} catch (Exception	e)	{
			// this block catches exception
			System.out.println("Implicit: Exception Handled Gracefully");
		} finally {
			// this block does the cleanup
			d.finalize();
		}
	}
}
