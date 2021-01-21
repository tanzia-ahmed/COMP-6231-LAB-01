package lab1.comp6231.org;

public abstract class BankAccount {

	protected int accNum;
	protected double balance;
	protected static int serialNum = 0;
	
	/** Default constructor 
	 * 
	 */
	public BankAccount()
	{
        // TODO ---- DONE
	    // check the balance
		balance = getBalance();
        // check the account Number
		++this.serialNum;
		accNum = getAccNum()+this.serialNum;
	}
	
	/** Overloaded constructor
	 */
	public BankAccount( double startBalance) throws Exception
	{
        // TODO ---- DONE
	    //deposit the balance
		balance = startBalance;
        //check the account number
		++this.serialNum;
		accNum = getAccNum()+this.serialNum;
	}
	
	/** accessor for balance
	 * 
	 */
	public double getBalance()
	{
        // TODO ---- DONE
        // get the balance
		applyComputation();
		if (balance >=0.0)
			return balance;
		else
			return 0.0;

    }
	
	/* accessor for account number
	 * 
	 */
	public int getAccNum()
	{
		return accNum;
	}
	
	/** Deposit amount to account
	 * 
	 */
	public void deposit( double amount ) throws Exception
	{
        // TODO
        // deposit amount of money, if it is legal/valid amount
		if(amount > 0.0){
			balance = balance + amount;
		}
		else
			throw new Exception("Invalid Deposit Amount");
	}
	
	/** withdraw amount from account
	 * 
	 */
	public void withdraw( double amount ) throws Exception
	{
		if(amount >= 0.0 && amount <= balance)
			balance -= amount;
		
		else
			throw new Exception("Insufficient Balance");
	}

	/**Override toString()
	 *
	 */
	public String toString()
	{
		// TODO: print the balance amount for specific account type displaying the account number. ---- DONE
		return "The balance is of the "+accType()+" "+getAccNum()+" is "+ getBalance();
	}
	
	public abstract void applyComputation();
	public abstract String accType();
}