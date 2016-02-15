package session5;

public class CalculateArea {
	private double length;
	private double width;
	private double height;
	private double base;
	private double rectangleArea;
	private double triangleArea;
	
	//Constructor
	CalculateArea(){};
	
	//Getters	
	private double getRectangleArea() {
		return rectangleArea;
	}
	
	private double getTriangleArea() {
		return triangleArea;
	}
	
	private double getLength() {
		return length;
	}
	
	private double getWidth() {
		return width;
	}
	
	private double getHeight(){
		return height;
	}
	
	private double getBase() {
		return base;
	}
	
	//Setters
	private void setLength(double length) {
		this.length = length;
	}
	
	private void setWidth(double width) {
		this.width = width;
	}
	
	private void setHeight(double height) {
		this.height = height;
	}
	
	private void setBase(double base) {
		this.base = base;
	}
	
	private void calcArea() {
		this.rectangleArea = getLength() * getWidth();
		this.triangleArea = getHeight() * getBase()/2;
	}
	
	public static void main(String[] args) {
		final double l = 10;
		final double w = 20;
		final double h = 10;
		final double b = 20;
		
		CalculateArea area = new CalculateArea();
		area.setLength(l);
		area.setWidth(w);
		area.setHeight(h);
		area.setBase(b);
		
		area.calcArea();
		
		System.out.println("Area of rectangle with length " + area.length + " and width " + area.width + " is " + area.rectangleArea);
		System.out.println("Area of triangle with height " + area.height + " and base " + area.base + " is " + area.triangleArea);
	}
	

}
