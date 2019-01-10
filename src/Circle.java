
public class Circle {
	
	private double radius; //variable for the radius
	
	public Circle() {
		
		radius = 1.0;
		
	}//end empty argument constructor
		
	public Circle(double radius) {
		
		setRadius(radius);
		//this.setRadius(radius);
		
	}//end preferred constructor
	
	public double calculateArea() {
		
		double area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}//end calculateArea
	
	/**
	 * this method returns the value of the radius
	 * @return - radius
	 */
	public double getRadius() {
		return radius;
	}//end getRadius

	/**
	 * this method sets the value of the radius
	 * the method bounds checks the radius > 1.0
	 * @param radius
	 */
	public void setRadius(double radius) {
		if (radius >= 1.0)
			this.radius = radius;//this refers to object
		else
			this.radius = 1.0;
		
	}//end setRadius

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	

}//end class
