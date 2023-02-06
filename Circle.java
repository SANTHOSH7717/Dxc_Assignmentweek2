package Ex;

class Circle{
	private final double PI = 3.17;
	private double diameter;
	private double circumference;
	private double area;
	public Circle(double diameter) {
	
		this.diameter = diameter;
	}
	
	void calculateCircumference(){
		circumference = Math.round(PI*diameter);
	}
	void calculateArea() {
		double radius = diameter/2;
		area = Math.round(PI*radius*radius);
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPI() {
		return PI;
	}
	
}

	