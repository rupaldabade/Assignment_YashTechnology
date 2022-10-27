package oops.programme3;


public class Customer_Account_Statement extends Customer {
	private String CAID;
	private String custId;
	private double amount;
	private double deposit;
	private double withdrawl;
	private String deposit_date;

	public Customer_Account_Statement(String CAID, String custId, double amount, double deposit, double withdrawl,
			String deposit_date) {
		this.CAID = CAID;
		this.custId = custId;
		this.amount = amount;
		this.deposit = deposit;
		this.withdrawl = withdrawl;
		this.deposit_date = deposit_date;
	}

	public String getCAID() {
		return CAID;
	}

	public void setCAID(String cAID) {
		this.CAID = cAID;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdrawl() {
		return withdrawl;
	}

	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}

	@Override
	public String toString() {
		return "Customer_Account_Statement [CAID=" + CAID + ", custId=" + custId + ", amount=" + amount + ", deposit="
				+ deposit + ", withdrawl=" + withdrawl + ", deposit_date=" + deposit_date + "]";
	}

	
	
}