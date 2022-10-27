package oops.programme5;


public class DClass extends CClass {
	
	public DClass() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The Division is :"+(a*b));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DClass d = new DClass();
	
		d.div(10, 2);
		d.mul(24, 32);
		d.sub(32, 23);
		d.sum(43, 34);
	}

}
