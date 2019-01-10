
public class Application {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println(c.toString());
		System.out.println(c.calculateArea());
		
		Circle c2 = new Circle(6.9);
		System.out.println(c2.toString());
		System.out.println(c2.calculateArea());
		
		Circle c3 = new Circle(-12.4);
		System.out.println(c3.toString());
		System.out.println(c3.calculateArea());
		
	}//end main

}//end class
