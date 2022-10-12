package springci;

public class Employee {
	
	private String name;
	private String team;
	private int id;
	public Employee(String name, int id, String team) {
		super();
		this.name = name;
		this.id = id;
		this.team = team;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", team=" + team + ", id=" + id + "]";
	}
	
	
}
