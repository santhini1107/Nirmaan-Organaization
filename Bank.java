package assessment2;

public class Bank {
	private int accountNum= 1200340056;
	private String accountHolderName= "SANTHINI S";
	private Double accountBalnce= 500000.55;
	private int pin= 3576;
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Double getAccountBalnce() {
		return accountBalnce;
	}
	public void setAccountBalnce(Double accountBalnce) {
		this.accountBalnce = accountBalnce;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "accountNum        = " + accountNum + "\naccountHolderName = " + accountHolderName + "\naccountBalnce     = "
				+ accountBalnce ;
	}
	

}
