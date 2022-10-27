package oops.programme3;


public class Customer  {
	private String cust_id;
	private String account_no;
	private String cust_name;
	private String cust_address;
	private String cust_dob;
	private String cust_account_opening_date;
	private Branch branch;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cust_id, String account_no, String cust_name, String cust_address, String cust_dob,
			String cust_account_opening_date, Branch branch) {
		this.cust_id = cust_id;
		this.account_no = account_no;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		this.branch = branch;
	}

	public Customer(String cust_id, String account_no, String cust_name, String cust_address, String cust_dob,
			String cust_account_opening_date) {
		super();
		this.cust_id = cust_id;
		this.account_no = account_no;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_account_opening_date() {
		return cust_account_opening_date;
	}

	public void setCust_account_opening_date(String cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", account_no=" + account_no + ", cust_name=" + cust_name
				+ ", cust_address=" + cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date="
				+ cust_account_opening_date + ", branch=" + branch + "]";
	}
	
	

	

	

}
