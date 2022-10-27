package  oops.programme10;


public class Product implements Cloneable {
	private String pid;
	private String pname;
	private double price;
	private String unitOfMeasurement;
	
	public Product clone() throws CloneNotSupportedException {
	    // call Object.clone()
		Product obj = (Product)super.clone();
		//obj.pname = (String) pname.clone();
	    return obj;
	}
	
	public Product(String pid, String pname, double price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
	
	 public String toString()
	    {
	        return ("Product[pname=" + pname
	                + ", price=" + price
	                + ", unitOfMeasurement=" + unitOfMeasurement
	                + "]");
	    }
	
		
}
