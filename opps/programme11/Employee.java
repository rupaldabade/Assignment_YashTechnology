package oops.programme11;


public class Employee {
	private String empId;
	private String empName;
	private String empSalary;
	private String empAddress;
	private String emp_dob;
	private String emp_doj;
	
	public Employee(String empId, String empName, String empSalary, String empAddress, String emp_dob, String emp_doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(String emp_dob) {
		this.emp_dob = emp_dob;
	}
	public String getEmp_doj() {
		return emp_doj;
	}
	public void setEmp_doj(String emp_doj) {
		this.emp_doj = emp_doj;
	}	
	
	public String toString()
    {
        return empName + " " + empSalary + " " + empAddress + " "+ emp_dob + " " + emp_doj;
    }
	
	
}
