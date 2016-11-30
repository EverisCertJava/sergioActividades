package mx.com.everis.tallerjava.interfaces;

public class ShapeFactory {
	
	Shape getShape(String shape){
		
		if(shape.equals("circle")){		
			return new Circle();
		}else if(shape.equals("square")){
			return new Square();
		}else if(shape.equals("rectangle")){
			return new Rectangle();
		}
		return null;
		
	}
}
