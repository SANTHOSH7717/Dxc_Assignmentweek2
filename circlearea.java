package Ex;

public class circlearea{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10.2);
		circle.calculateCircumference();
		circle.calculateArea();
		System.out.println("Diameter of the circle is: "+ circle.getDiameter()+
				"\n"+"Circumference of circle is: "+circle.getCircumference()+
				"\n"+"Area of the circle is: "+	circle.getArea());
		

	}
}

