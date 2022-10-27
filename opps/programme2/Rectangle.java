package oops.programme2;

public abstract class Rectangle implements Shape  {
	
	private double vertex_AB;//side AB = CD
	private double vertex_BC;//side BC = AD 
	
	public Rectangle(double vertex_AB,double vertex_BC) {
		this.vertex_AB = vertex_AB;
		this.vertex_BC = vertex_BC;
	}

	public double area() {
		//As per maths formula 
		//Area of rectangle = length * breadth;
		return vertex_AB * vertex_BC;
	}
	
	public double printArea() {
		//As per the Maths Formula
		//Perimeter of a rectangle is 2 * (l + B);
		return 2 * (vertex_AB + vertex_BC);
	}
	
	@Override
	public String toString() {
		return "Area of a Rectangle ABCD is " + area()+ " sqrm \nAnd print area of Rectangle ABCD is " + printArea() + " m";
	}
}