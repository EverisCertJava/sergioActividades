package mx.com.everis.tallerjava.interfaces;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		ShapeFactory factory = new ShapeFactory();
		
		Shape Circle = factory.getShape("circle");
		Shape  Rectangle = factory.getShape("rectangle");
		Shape Square = factory.getShape("square");
	}

}
