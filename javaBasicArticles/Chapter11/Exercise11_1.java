package chapter11;

public class Exercise11_1 {
	  public static void main(String[] args) {
	    Triangle triangle = new Triangle(1, 1.5, 1);
	    triangle.setColor("yellow");
	    triangle.setFilled(true);

	    System.out.println(triangle);
	    System.out.println("The area is " + triangle.getArea());
	    System.out.println("The perimeter is "
	      + triangle.getPerimeter());
	    System.out.println(triangle);
	  }
}

class Triangle extends GeometricObject {
	private double side1 = 1.0,side2 = 2.0,side3 = 3.0;
	
	public Triangle(){
	}
	
	public Triangle(double side1,double side2,double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}