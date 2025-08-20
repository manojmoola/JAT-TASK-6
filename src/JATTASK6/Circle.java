package JATTASK6;

public class Circle {
	private double radius;

	public Circle() {
		this.radius = 1.0;
	} 

	public Circle(double r) {
		this.radius = r;
	} 

	public double getRadius() {
		return radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(); 
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Circumference: " + c1.getCircumference());

	}
}
