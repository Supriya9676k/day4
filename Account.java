public class Account{
	
	private int accountNumber;
	private String accountHolder;
    private int balance;
    
	public void setaccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	public void setAccountHolder(String accountHolder){
		this.accountHolder=accountHolder;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	
	public int getaccountNumber(){
		return accountNumber;
	}
	public String getAccountHolder(){
		return accountHolder;
	}
	public int getBalance(){
		return balance;
	}
	public int deposit(int amount){
		return balance+amount;
	}
	public int withdraw(int amount){
		return balance-amount;
	}
	
	}
